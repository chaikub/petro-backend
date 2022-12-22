package com.example.test.command.rest.controller;

import com.proto.prime.AddOilToFavoriteRequest;
import com.proto.prime.OilServiceGrpc;
import io.grpc.ManagedChannel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/favOil")
public class FavOilCommandController {
    private final OilServiceGrpc.OilServiceBlockingStub blockingStub;
    private final CommandGateway commandGateway;

    public FavOilCommandController(ManagedChannel channel, CommandGateway commandGateway){
        this.commandGateway = commandGateway;
        this.blockingStub = OilServiceGrpc.newBlockingStub(channel);
    }
    @PostMapping("/{username}/{name}")
    public boolean addToFav(@PathVariable String username,@PathVariable String name){
        AddOilToFavoriteRequest addFavRequest = AddOilToFavoriteRequest.newBuilder()
                .setUsername(username)
                .setName(name)
                .build();
        return blockingStub.addOilToFavorite(addFavRequest).getIsSuccess();
    }
}
