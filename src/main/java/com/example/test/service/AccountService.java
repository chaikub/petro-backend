package com.example.test.service;

import com.example.test.core.AccountEntity;
import com.example.test.core.data.AccountRepository;
import com.proto.prime.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService extends AccountServiceGrpc.AccountServiceImplBase {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void getAccounts(GetAccountsRequest request, StreamObserver<GetAccountsResponse> responseObserver) {
        boolean isSuccess = true;
        try {
            List<AccountEntity> accounts = accountRepository.findAll();
            for(AccountEntity account: accounts){
                System.out.println("username : " + account.getUsername());
                System.out.println("password : " + account.getPassword());
            }
        }catch (Exception e){
            isSuccess = false;
        }
        GetAccountsResponse response = GetAccountsResponse.newBuilder()
                .setIsSuccess(isSuccess)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();;
    }
}
