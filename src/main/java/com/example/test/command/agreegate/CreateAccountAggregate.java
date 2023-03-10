package com.example.test.command.agreegate;

import com.example.test.command.CreateAccountCommand;
import com.example.test.command.rest.model.FavRouteRestModel;
import com.example.test.command.event.AccountCreateEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Aggregate
public class CreateAccountAggregate {

    @AggregateIdentifier
    private String _id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;

    private List<String> favoil;
    private List<FavRouteRestModel> favRoute;

    public CreateAccountAggregate(){};

    @CommandHandler
    public CreateAccountAggregate(CreateAccountCommand createAccountCommand){
        AccountCreateEvent accountCreateEvent = new AccountCreateEvent();
        BeanUtils.copyProperties(createAccountCommand, accountCreateEvent);
        AggregateLifecycle.apply(accountCreateEvent);
    }
    @EventSourcingHandler
    public void on(AccountCreateEvent accountCreateEvent){
        this._id = accountCreateEvent.get_id();
        this.username = accountCreateEvent.getUsername();
        this.password = accountCreateEvent.getPassword();
        this.firstName = accountCreateEvent.getFirstName();
        this.lastName = accountCreateEvent.getLastName();
        this.phone = accountCreateEvent.getPhone();
        this.favoil = accountCreateEvent.getFavoil();
        this.favRoute = accountCreateEvent.getFavRoute();
    }
}
