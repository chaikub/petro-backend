package com.example.test.service;

import com.proto.prime.CalculateRequest;
import com.proto.prime.CalculateResponse;
import com.proto.prime.CalculateServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class CalculateService extends CalculateServiceGrpc.CalculateServiceImplBase {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void calculate(CalculateRequest request, StreamObserver<CalculateResponse> responseObserver) {
        double price = 0;
        try {
            double v = request.getDistance()/ request.getRateOfWaste();
            price = request.getOilPrice()*v;
            System.out.println(df.format(price));
        }catch (Exception e){
            System.out.println(e);
        }
        CalculateResponse response = CalculateResponse.newBuilder()
                .setResult(Double.parseDouble(df.format(price)))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
