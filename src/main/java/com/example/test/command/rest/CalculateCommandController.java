package com.example.test.command.rest;

import com.example.test.command.rest.CalculateRestModel;
import com.proto.prime.CalculateRequest;
import com.proto.prime.CalculateServiceGrpc;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateCommandController {
    private final CalculateServiceGrpc.CalculateServiceBlockingStub blockingStub;
    private final CalculateServiceGrpc.CalculateServiceStub stub;

    public CalculateCommandController(ManagedChannel channel){
        this.stub = CalculateServiceGrpc.newStub(channel);
        this.blockingStub = CalculateServiceGrpc.newBlockingStub(channel);
    }

    @PostMapping
    public double Calculate(@RequestBody CalculateRestModel model){
        CalculateRequest calculateRequest = CalculateRequest.newBuilder()
                .setDistance(model.getDistance())
                .setOilPrice(model.getOil_Price())
                .setRateOfWaste(model.getRate_of_waste())
                .build();
        return blockingStub.calculate(calculateRequest).getResult();
    }
}
