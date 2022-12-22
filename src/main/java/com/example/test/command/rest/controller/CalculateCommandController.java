package com.example.test.command.rest.controller;

import com.example.test.command.CalculateCommand;
import com.example.test.command.rest.model.CalculateRestModel;
import com.proto.prime.CalculateRequest;
import com.proto.prime.CalculateServiceGrpc;
import io.grpc.ManagedChannel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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

    @PostMapping
    public double Calculate(@RequestBody CalculateRestModel model){
        CalculateRequest calculateRequest = CalculateRequest.newBuilder()
                .setDistance(model.getDistance())
                .setOilPrice(model.getOil_Price())
                .setKmPerOil(model.getKm_per_oil())
                .build();
        CalculateCommand command = CalculateCommand.builder()
                ._id(UUID.randomUUID().toString())
                .distance(model.getDistance())
                .oil_Price(model.getOil_Price())
                .km_per_oil(model.getKm_per_oil())
                .build();
        commandGateway.sendAndWait(command);
        return blockingStub.calculate(calculateRequest).getResult();
    }
}
