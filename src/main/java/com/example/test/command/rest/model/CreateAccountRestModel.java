package com.example.test.command.rest.model;

import com.proto.prime.FavRoute;
import lombok.Data;

import java.util.List;

@Data
public class CreateAccountRestModel {
    private String _id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private List<String> favoil;
    private List<FavRouteRest> favRoute;
}
