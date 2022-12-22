package com.example.test.service;

import com.example.test.command.rest.FavRouteRest;
import com.example.test.core.AccountEntity;
import com.example.test.core.data.AccountRepository;
import com.proto.prime.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService extends RouteServiceGrpc.RouteServiceImplBase {
    @Autowired
    private AccountRepository accountRepository;
    boolean isSuccess = false;

    public FavRouteRest convertFavProtoToRestModel(Route favRoute){
        FavRouteRest favRouteRest = new FavRouteRest();
        favRouteRest.setStartName(favRoute.getStartName());
        favRouteRest.setDestination(favRoute.getDestination());
        favRouteRest.setDistance(favRoute.getDistance());
        favRouteRest.setOil(favRoute.getOil());
        return favRouteRest;
    }
    @Override
    public void addRouteToFavorite(AddRouteToFavoriteRequest request, StreamObserver<AddRouteToFavoriteResponse> responseObserver) {
        try {
            System.out.println(request.getRoute());
            AccountEntity account = accountRepository.findByUsername(request.getUsername());
            List<FavRouteRest> favRoutes = account.getFavRoute();
            favRoutes.add(convertFavProtoToRestModel(request.getRoute()));
            account.setFavRoute(favRoutes);
            System.out.println(account.getFavRoute());
            accountRepository.save(account);
            isSuccess = true;

        }catch (Exception e){
            System.out.println(e);
        }
        AddRouteToFavoriteResponse response = AddRouteToFavoriteResponse.newBuilder()
                .setIsSuccess(isSuccess)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void removeAddRouteToFavorite(RemoveRouteFromFavoriteRequest request, StreamObserver<RemoveRouteFromFavoriteResponse> responseObserver) {
        try {
            System.out.println(request.getRoute());
            AccountEntity account = accountRepository.findByUsername(request.getUsername());
            List<FavRouteRest> favRoutes = account.getFavRoute();
            favRoutes.remove(convertFavProtoToRestModel(request.getRoute()));
            System.out.println(favRoutes);
            account.setFavRoute(favRoutes);
            System.out.println(account);
            accountRepository.save(account);
            isSuccess = true;

        }catch (Exception e){
            System.out.println(e);
        }
        RemoveRouteFromFavoriteResponse response = RemoveRouteFromFavoriteResponse.newBuilder()
                .setIsSuccess(isSuccess)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
