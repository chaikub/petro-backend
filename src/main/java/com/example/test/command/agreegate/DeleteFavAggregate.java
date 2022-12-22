package com.example.test.command.agreegate;

import com.example.test.command.DeleteFavCommand;
import com.example.test.command.event.FavAddEvent;
import com.example.test.command.event.FavDeleteEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

@Aggregate
public class DeleteFavAggregate {
    @AggregateIdentifier
    private String _id;
    private String username;
    private String startName;
    private String destination;
    private double distance;
    private String oil;

    public DeleteFavAggregate(){}

    @CommandHandler
    public DeleteFavAggregate(DeleteFavCommand deleteFavCommand){
        FavDeleteEvent favDeleteEvent = new FavDeleteEvent();
        BeanUtils.copyProperties(deleteFavCommand, favDeleteEvent);
        AggregateLifecycle.apply(favDeleteEvent);
    }
    @EventSourcingHandler
    public void on(FavDeleteEvent favDeleteEvent){
        this._id = favDeleteEvent.get_id();
        this.distance = favDeleteEvent.getDistance();
        this.username = favDeleteEvent.getUsername();
        this.startName = favDeleteEvent.getStartName();
        this.destination = favDeleteEvent.getDestination();
        this.oil = favDeleteEvent.getOil();
    }
}
