package com.example.test.command.rest.controller;

import com.proto.prime.CalculateRequest;
import com.proto.prime.CalculateServiceGrpc;
import io.grpc.ManagedChannel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculateCommandController {
    private final CalculateServiceGrpc.CalculateServiceBlockingStub blockingStub;

    private final CommandGateway commandGateway;

    @Autowired
    public CalculateCommandController(ManagedChannel channel, CommandGateway commandGateway){
        this.blockingStub = CalculateServiceGrpc.newBlockingStub(channel);
        this.commandGateway = commandGateway;
    }

    @PostMapping("/{distance}/{oil_price}/{km_per_oil}")
    public double Calculate(@PathVariable double distance, @PathVariable double oil_price, @PathVariable double km_per_oil){
        CalculateRequest calculateRequest = CalculateRequest.newBuilder()
                .setDistance(distance)
                .setOilPrice(oil_price)
                .setKmPerOil(km_per_oil)
                .build();
        return blockingStub.calculate(calculateRequest).getResult();
    }
}
