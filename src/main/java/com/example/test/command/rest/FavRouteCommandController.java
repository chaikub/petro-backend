package com.example.test.command.rest;

import com.proto.prime.*;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favRoute")
public class FavRouteCommandController {
    private final RouteServiceGrpc.RouteServiceBlockingStub blockingStub;
    private final RouteServiceGrpc.RouteServiceStub stub;

    public FavRouteCommandController(ManagedChannel channel){
        this.stub = RouteServiceGrpc.newStub(channel);
        this.blockingStub = RouteServiceGrpc.newBlockingStub(channel);
    }

    public Route convertRouteReq(String start,  String destination, int distance,String oil){
        Route route = Route.newBuilder().setDistance(distance).setDestination(destination).setStartName(start).setOil(oil).build();
        return route;
    }

    @PostMapping("/{username}/{start}/{destination}/{distance}/{oil}")
    public boolean addFavRoute(@PathVariable String username, @PathVariable String start, @PathVariable String destination, @PathVariable int distance, @PathVariable String oil){
        AddRouteToFavoriteRequest addFavRequest = AddRouteToFavoriteRequest.newBuilder().setUsername(username).setRoute(convertRouteReq(start,destination,distance,oil)).build();
        return blockingStub.addRouteToFavorite(addFavRequest).getIsSuccess();
    }

    @DeleteMapping("/{username}/{start}/{destination}/{distance}/{oil}")
    public boolean removeFavRoute(@PathVariable String username, @PathVariable String start, @PathVariable String destination, @PathVariable int distance, @PathVariable String oil){
        RemoveRouteFromFavoriteRequest removeFavRequest = RemoveRouteFromFavoriteRequest.newBuilder().setUsername(username).setRoute(convertRouteReq(start,destination,distance,oil)).build();
        return blockingStub.removeAddRouteToFavorite(removeFavRequest).getIsSuccess();
    }


}
