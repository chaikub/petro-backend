package com.example.test.command.rest;

import com.proto.prime.*;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/signUp")
public class AccountCommandController {
    private final AccountServiceGrpc.AccountServiceBlockingStub blockingStub;
    private final AccountServiceGrpc.AccountServiceStub stub;

    public AccountCommandController(ManagedChannel channel){
        this.stub = AccountServiceGrpc.newStub(channel);
        this.blockingStub = AccountServiceGrpc.newBlockingStub(channel);
    }

    public List<FavRoute> convertFavModelToRequest(List<FavRouteRest> favRoute){
        List<FavRoute> favRoutes = new ArrayList<>();
        for(FavRouteRest favRouteList: favRoute){
            FavRoute fav = FavRoute.newBuilder()
                    .setDistance(favRouteList.getDistance())
                    .setDestination(favRouteList.getDestination())
                    .setOil(favRouteList.getOil())
                    .setStartName(favRouteList.getStartName())
                    .build();
            favRoutes.add(fav);
        }
        return favRoutes;
    }

    @PostMapping
    public boolean createAccount(@RequestBody CreateAccountRestModel model){
        SignUpRequest signUp = SignUpRequest.newBuilder()
                .setUsername(model.getUsername())
                .setPassword(model.getPassword())
                .setFirstName(model.getFirstName())
                .setLastName(model.getLastName())
                .setPhone(model.getPhone())
                .addAllFavoil(model.getFavoil())
                .addAllFavRoute(convertFavModelToRequest(model.getFavRoute()))
                .build();
        return blockingStub.signUp(signUp).getIsSuccess();
    }

}
