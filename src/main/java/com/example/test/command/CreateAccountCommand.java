package com.example.test.command;

import com.example.test.command.rest.model.FavRouteRestModel;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.List;

@Builder
@Data
public class CreateAccountCommand {
    @TargetAggregateIdentifier
    private String _id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private List<String> favoil;
    private List<FavRouteRestModel> favRoute;
}
