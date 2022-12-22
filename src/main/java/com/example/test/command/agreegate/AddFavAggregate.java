package com.example.test.command.agreegate;

import com.example.test.command.AddFavCommand;
import com.example.test.command.event.FavAddEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

@Aggregate
public class AddFavAggregate {
    @AggregateIdentifier
    private String _id;
    private String username;
    private String startName;
    private String destination;
    private double distance;
    private String oil;

    public AddFavAggregate() {
    }

    @CommandHandler
    public AddFavAggregate(AddFavCommand addFavCommand) {
        FavAddEvent favAddEvent = new FavAddEvent();
        BeanUtils.copyProperties(addFavCommand, favAddEvent);
        AggregateLifecycle.apply(favAddEvent);
    }
    @EventSourcingHandler
    public void on(FavAddEvent favAddEvent){
        this._id = favAddEvent.get_id();
        this.distance = favAddEvent.getDistance();
        this.username = favAddEvent.getUsername();
        this.startName = favAddEvent.getStartName();
        this.destination = favAddEvent.getDestination();
        this.oil = favAddEvent.getOil();
    }

}
