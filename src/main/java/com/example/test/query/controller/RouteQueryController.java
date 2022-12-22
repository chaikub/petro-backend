package com.example.test.query.controller;

import com.example.test.command.rest.model.FavRouteRestModel;
import com.example.test.query.model.RouteRestModel;
import com.proto.prime.*;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/getFavRoute")
public class RouteQueryController{
    private final RouteServiceGrpc.RouteServiceBlockingStub blockingStub;
    private final RouteServiceGrpc.RouteServiceStub stub;

    public RouteQueryController(ManagedChannel channel){
        this.stub = RouteServiceGrpc.newStub(channel);
        this.blockingStub = RouteServiceGrpc.newBlockingStub(channel);
    }
    public List<RouteRestModel> convertProtoToRest(List<Route> favRoute){
        List<RouteRestModel> favRoutes = new ArrayList<>();
        for(Route favRouteList: favRoute){
            RouteRestModel routeRestModel = new RouteRestModel();
            routeRestModel.setDestination(favRouteList.getDestination());
            routeRestModel.setOil(favRouteList.getOil());
            routeRestModel.setStartName(favRouteList.getStartName());
            routeRestModel.setDistance(favRouteList.getDistance());
            favRoutes.add(routeRestModel);
        }
        return favRoutes;
    }

    @GetMapping("/{username}")
    public List<RouteRestModel> queryFavRoute(@PathVariable String username){
        QueryFavRoutesRequest favRoutesRequest = QueryFavRoutesRequest.newBuilder().setUsername(username).build();
        List<Route> route = blockingStub.queryFavRoute(favRoutesRequest).getFavRoutesList();
        List<RouteRestModel> routeRestModels = convertProtoToRest(route);
        return routeRestModels;
    }
}
