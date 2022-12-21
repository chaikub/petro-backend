package com.example.test.query.rest;


import com.proto.prime.AccountServiceGrpc;
import com.proto.prime.SignInRequest;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/signIn")
public class AccountQueryController {

    private final AccountServiceGrpc.AccountServiceBlockingStub blockingStub;
    private final AccountServiceGrpc.AccountServiceStub stub;

   public AccountQueryController(ManagedChannel channel){
       this.stub = AccountServiceGrpc.newStub(channel);
       this.blockingStub = AccountServiceGrpc.newBlockingStub(channel);
   }

    @GetMapping
    public boolean SignIn(@RequestBody SignInRestModel model){
        System.out.println(model.getUsername());
        SignInRequest signInRequest = SignInRequest.newBuilder().setUsername(model.getUsername()).setPassword(model.getPassword()).build();
        return blockingStub.signIn(signInRequest).getIsSuccess();
    }
}
