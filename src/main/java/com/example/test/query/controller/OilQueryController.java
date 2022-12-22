package com.example.test.query.controller;

import com.proto.prime.AccountServiceGrpc;
import com.proto.prime.OilServiceGrpc;
import com.proto.prime.QueryFavOilRequest;
import com.proto.prime.SignInRequest;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getFavOil")
public class OilQueryController {
    private final OilServiceGrpc.OilServiceBlockingStub blockingStub;
    private final OilServiceGrpc.OilServiceStub stub;

    public OilQueryController(ManagedChannel channel) {
        this.stub = OilServiceGrpc.newStub(channel);
        this.blockingStub = OilServiceGrpc.newBlockingStub(channel);
    }

    @GetMapping("/{username}")
    public List<String> queryFavOil(@PathVariable String username){
        QueryFavOilRequest favOilRequest = QueryFavOilRequest.newBuilder().setUsername(username).build();
        return blockingStub.queryFavOil(favOilRequest).getNameList();
    }
}
