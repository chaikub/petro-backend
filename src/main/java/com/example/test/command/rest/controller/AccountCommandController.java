package com.example.test.command.rest.controller;

import com.example.test.command.CreateAccountCommand;
import com.example.test.command.rest.FavRouteRest;
import com.example.test.command.rest.model.CreateAccountRestModel;
import com.proto.prime.*;
import io.grpc.ManagedChannel;
//import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.axonframework.commandhandling.gateway.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/signUp")
public class AccountCommandController {

    private final CommandGateway commandGateway;
    private final AccountServiceGrpc.AccountServiceBlockingStub blockingStub;

    @Autowired
    public AccountCommandController(ManagedChannel channel, CommandGateway commandGateway){
        this.blockingStub = AccountServiceGrpc.newBlockingStub(channel);
        this.commandGateway = commandGateway;
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
//        CreateAccountCommand command = CreateAccountCommand.builder()
//                ._id(UUID.randomUUID().toString())
//                .username(model.getUsername())
//                .password(model.getPassword())
//                .firstName(model.getFirstName())
//                .lastName(model.getLastName())
//                .phone(model.getPhone())
//                .favoil(model.getFavoil())
//                .favRoute(model.getFavRoute())
//                .build();
//        commandGateway.sendAndWait(command);
        return blockingStub.signUp(signUp).getIsSuccess();
    }

}
