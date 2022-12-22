package com.example.test.query.controller;

import com.proto.prime.QueryFavOilRequest;
import com.proto.prime.QueryFavRoutesResquest;
import com.proto.prime.Route;
import com.proto.prime.RouteServiceGrpc;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/getFavRoute")
public class RouteQueryController {
    private final RouteServiceGrpc.RouteServiceBlockingStub blockingStub;
    private final RouteServiceGrpc.RouteServiceStub stub;

    public RouteQueryController(ManagedChannel channel){
        this.stub = RouteServiceGrpc.newStub(channel);
        this.blockingStub = RouteServiceGrpc.newBlockingStub(channel);
    }

    public List<String> convertRouteToString(List<Route> routeList){
        List<String> routeString = new ArrayList<>();
        routeString.add(routeList.toString());
        return routeString;
    }

    @GetMapping("/{username}")
    public List<String> queryFavRoute(@PathVariable String username){
        QueryFavRoutesResquest favRoutesResquest = QueryFavRoutesResquest.newBuilder().setUsername(username).build();
        return convertRouteToString(blockingStub.queryFavRoute(favRoutesResquest).getFavRoutesList());
    }
}
