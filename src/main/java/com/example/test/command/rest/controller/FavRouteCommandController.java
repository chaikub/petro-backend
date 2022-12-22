package com.example.test.command.rest.controller;

import com.example.test.command.AddFavCommand;
import com.example.test.command.DeleteFavCommand;
import com.example.test.command.rest.model.FavRouteRestModel;
import com.proto.prime.*;
import io.grpc.ManagedChannel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/favRoute")
public class FavRouteCommandController {
    private final CommandGateway commandGateway;
    private final RouteServiceGrpc.RouteServiceBlockingStub blockingStub;

    @Autowired
    public FavRouteCommandController(ManagedChannel channel, CommandGateway commandGateway){
        this.commandGateway = commandGateway;
        this.blockingStub = RouteServiceGrpc.newBlockingStub(channel);
    }

    public Route convertRouteReq(String start,  String destination, double distance,String oil){
        Route route = Route.newBuilder().setDistance(distance).setDestination(destination).setStartName(start).setOil(oil).build();
        return route;
    }

    @PostMapping
    public boolean addFavRoute(@RequestBody FavRouteRestModel model){
        AddRouteToFavoriteRequest addFavRequest = AddRouteToFavoriteRequest.newBuilder()
                .setUsername(model.getUsername())
                .setRoute(convertRouteReq(model.getStartName(), model.getDestination(), model.getDistance(), model.getOil()))
                .build();
        AddFavCommand command = AddFavCommand.builder()
                ._id(UUID.randomUUID().toString())
                .startName(model.getStartName())
                .destination(model.getDestination())
                .distance(model.getDistance())
                .username(model.getUsername())
                .oil(model.getOil())
                .build();
        commandGateway.sendAndWait(command);
        return blockingStub.addRouteToFavorite(addFavRequest).getIsSuccess();
    }

    @DeleteMapping
    public boolean removeFavRoute(@RequestBody FavRouteRestModel model){
        RemoveRouteFromFavoriteRequest removeFavRequest = RemoveRouteFromFavoriteRequest.newBuilder()
                .setUsername(model.getUsername())
                .setRoute(convertRouteReq(model.getStartName(), model.getDestination(), model.getDistance(), model.getOil())).build();
        DeleteFavCommand command = DeleteFavCommand.builder()
                ._id(UUID.randomUUID().toString())
                .startName(model.getStartName())
                .destination(model.getDestination())
                .username(model.getUsername())
                .oil(model.getOil())
                .distance(model.getDistance())
                .build();
        commandGateway.sendAndWait(command);
        return blockingStub.removeAddRouteToFavorite(removeFavRequest).getIsSuccess();
    }


}
