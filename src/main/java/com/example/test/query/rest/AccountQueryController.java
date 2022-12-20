package com.example.test.query.rest;


import com.proto.prime.AccountServiceGrpc;
import com.proto.prime.GetAccountsRequest;
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

    @GetMapping("/{username}/{password}")
    public boolean SignIn(@PathVariable String username, @PathVariable String password){
        SignInRequest signInRequest = SignInRequest.newBuilder().setUsername(username).setPassword(password).build();
        return blockingStub.signIn(signInRequest).getIsSuccess();
    }
}
