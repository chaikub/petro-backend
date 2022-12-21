package com.example.test.service;

import com.example.test.core.AccountEntity;
import com.example.test.core.data.AccountRepository;
import com.proto.prime.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OilService extends OilServiceGrpc.OilServiceImplBase {
    boolean isSuccess = false;
    @Autowired
    private AccountRepository accountRepository;

    //add favorite oil
    @Override
    public void addOilToFavorite(AddOilToFavoriteRequest request, StreamObserver<AddOilToFavoriteResponse> responseObserver) {
        try {
            System.out.println(request);
            AccountEntity account = accountRepository.findByUsername(request.getUsername());
            List<String> favoil = account.getFavoil();
            favoil.add(request.getName());
            account.setFavoil(favoil);
            System.out.println(account);
            accountRepository.save(account);
            isSuccess = true;

        }catch (Exception e){
            System.out.println(e);
        }
        AddOilToFavoriteResponse response = AddOilToFavoriteResponse.newBuilder()
                .setIsSuccess(isSuccess)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    //remove favorite oil
    @Override
    public void removeFavOil(RemoveOilFromFavoriteRequest request, StreamObserver<RemoveOilFromFavoriteResponse> responseObserver) {
        try {
            System.out.println(request);
            AccountEntity account = accountRepository.findByUsername(request.getUsername());
            List<String> favoil = account.getFavoil();
            favoil.remove(request.getName());
            account.setFavoil(favoil);
            System.out.println(account);
            accountRepository.save(account);
            isSuccess = true;

        }catch (Exception e){
            System.out.println(e);
        }
        RemoveOilFromFavoriteResponse response = RemoveOilFromFavoriteResponse.newBuilder()
                .setIsSuccess(isSuccess)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
