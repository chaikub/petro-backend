package com.example.test.query.rest;


import com.proto.prime.AccountServiceGrpc;
import com.proto.prime.GetAccountsRequest;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountQueryController {

    private final AccountServiceGrpc.AccountServiceBlockingStub blockingStub;
    private final AccountServiceGrpc.AccountServiceStub stub;

   public AccountQueryController(ManagedChannel channel){
       this.stub = AccountServiceGrpc.newStub(channel);
       this.blockingStub = AccountServiceGrpc.newBlockingStub(channel);
   }

    @GetMapping
    public boolean getAccounts(){
        GetAccountsRequest accountsRequest = GetAccountsRequest.newBuilder().build();
        return blockingStub.getAccounts(accountsRequest).getIsSuccess();
    }
}
