package com.example.test.service;

import com.example.test.core.data.AccountRepository;
import com.proto.prime.AddOilToFavoriteRequest;
import com.proto.prime.AddOilToFavoriteResponse;
import com.proto.prime.OilServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OilService extends OilServiceGrpc.OilServiceImplBase {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void addOilToFavorite(AddOilToFavoriteRequest request, StreamObserver<AddOilToFavoriteResponse> responseObserver) {
        try {
            System.out.println(request);
        }catch (Exception e){
            System.out.println(e);
        }
        AddOilToFavoriteResponse response = AddOilToFavoriteResponse.newBuilder()
                .setIsSuccess(true)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
