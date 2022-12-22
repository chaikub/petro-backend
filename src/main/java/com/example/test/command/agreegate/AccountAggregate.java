package com.example.test.command;

import com.example.test.command.rest.AccountCommandController;
import com.example.test.command.rest.FavRouteRest;
import com.example.test.core.event.AccountCreateEvent;
import com.proto.prime.FavRoute;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Aggregate
public class AccountAggregate {

    @AggregateIdentifier
    private String _id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;

    private List<String> favoil;
    private List<FavRouteRest> favRoute;

    public AccountAggregate(){};

    @CommandHandler
    public AccountAggregate(AccountCommandController accountCommandController){
        AccountCreateEvent accountCreateEvent = new AccountCreateEvent();
        BeanUtils.copyProperties(accountCommandController, accountCreateEvent);
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
