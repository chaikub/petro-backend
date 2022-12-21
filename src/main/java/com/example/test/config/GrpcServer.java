package com.example.test.config;

import com.example.test.service.AccountService;
import com.example.test.service.CalculateService;
import com.example.test.service.OilService;
import com.mongodb.client.MongoClient;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServer {
    @Autowired
    private AccountService accountService;
    @Autowired
    private OilService oilService;
    @Autowired
    private CalculateService calculateService;
    @Bean
    public ServerBuilder<?> serverBuilder(MongoClient mongoClient){
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(50052);
        serverBuilder.addService(accountService);
        serverBuilder.addService(oilService);
        serverBuilder.addService(calculateService);
        return serverBuilder;
    }
}
