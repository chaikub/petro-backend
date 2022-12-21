package com.example.test.command.rest;

import com.proto.prime.*;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signUp")
public class AccountCommandController {
    private final AccountServiceGrpc.AccountServiceBlockingStub blockingStub;
    private final AccountServiceGrpc.AccountServiceStub stub;

    public AccountCommandController(ManagedChannel channel){
        this.stub = AccountServiceGrpc.newStub(channel);
        this.blockingStub = AccountServiceGrpc.newBlockingStub(channel);
    }
    @PostMapping
    public boolean createAccount(@RequestBody CreateAccountRestModel model){
        SignUpRequest signUp = SignUpRequest.newBuilder()
                .setUsername(model.getUsername())
                .setPassword(model.getPassword())
                .setFirstName(model.getFirstName())
                .setLastName(model.getLastName())
                .setPhone(model.getPhone())
                .build();
        return blockingStub.signUp(signUp).getIsSuccess();
    }

}
