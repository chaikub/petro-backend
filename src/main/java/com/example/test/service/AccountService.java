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

//    @Override
//    public void getAccounts(GetAccountsRequest request, StreamObserver<GetAccountsResponse> responseObserver) {
//        boolean isSuccess = false;
//        try {
//            AccountEntity account = accountRepository.findByUsername(request.getUsername());
//            if(account.getPassword().equals(request.getPassword())){
//                isSuccess = true;
//            }
//            System.out.println(account);
//        }catch (Exception e){
//            System.out.println(e);
//            isSuccess = false;
//        }
//        GetAccountsResponse response = GetAccountsResponse.newBuilder()
//                .setIsSuccess(isSuccess)
//                .build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();;
//    }

    @Override
    public void signIn(SignInRequest request, StreamObserver<SignInResponse> responseObserver) {
        boolean isSuccess = false;
        try {
            AccountEntity account = accountRepository.findByUsername(request.getUsername());
            if(account.getPassword().equals(request.getPassword())){
                isSuccess = true;
            }
            System.out.println(account);
        }catch (Exception e){
            System.out.println(e);
            isSuccess = false;
        }
        SignInResponse response = SignInResponse.newBuilder()
                .setIsSuccess(isSuccess)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void signUp(SignUpRequest request, StreamObserver<SignUpResponse> responseObserver) {
        boolean isSuccess = false;
        boolean hasAlreadyUsed = false;
        try {
            List<AccountEntity> allAccount = accountRepository.findAll();
            for(AccountEntity account:allAccount){
                if(account.getUsername().equals(request.getUsername()) ){
                    hasAlreadyUsed = true;
                }
            }
            if(!hasAlreadyUsed){
                AccountEntity account = new AccountEntity();
                account.setUsername(request.getUsername());
                account.setPassword(request.getPassword());
                account.setFirstName(request.getFirstName());
                account.setLastName(request.getLastName());
                account.setPhone(request.getPhone());
                accountRepository.save(account);
                System.out.println(account);
                isSuccess = true;
            }


        }catch (Exception e){
            System.out.println(e);
            isSuccess = false;
        }
        SignUpResponse response = SignUpResponse.newBuilder()
                .setIsSuccess(isSuccess)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
