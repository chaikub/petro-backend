package com.example.test.command.rest;

import com.proto.prime.AddOilToFavoriteRequest;
import com.proto.prime.OilServiceGrpc;
import com.proto.prime.RemoveOilFromFavoriteRequest;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/favOil")
public class FavOilCommandController {
    private final OilServiceGrpc.OilServiceBlockingStub blockingStub;
    private final OilServiceGrpc.OilServiceStub stub;

    public FavOilCommandController(ManagedChannel channel){
        this.stub = OilServiceGrpc.newStub(channel);
        this.blockingStub = OilServiceGrpc.newBlockingStub(channel);
    }
    @PostMapping("/{username}/{name}")
    public boolean addToFav(@PathVariable String username,@PathVariable String name){
        AddOilToFavoriteRequest addFavRequest = AddOilToFavoriteRequest.newBuilder().setUsername(username).setName(name).build();
        return blockingStub.addOilToFavorite(addFavRequest).getIsSuccess();
    }
    @DeleteMapping("/{username}/{name}")
    public boolean delFromFav(@PathVariable String username,@PathVariable String name){
        RemoveOilFromFavoriteRequest removeFavRequest = RemoveOilFromFavoriteRequest.newBuilder().setUsername(username).setName(name).build();
        return blockingStub.removeFavOil(removeFavRequest).getIsSuccess();
    }
}
