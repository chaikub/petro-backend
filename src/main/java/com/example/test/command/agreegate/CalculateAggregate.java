package com.example.test.command.agreegate;

import com.example.test.command.CalculateCommand;
import com.example.test.command.event.CalculateCreateEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

@Aggregate
public class CalculateAggregate {

    @AggregateIdentifier
    private String _id;
    private double distance;
    private double oil_Price;
    private double km_per_oil;

    public CalculateAggregate(){};

    @CommandHandler
    public CalculateAggregate(CalculateCommand calculateCommand){
        CalculateCreateEvent calculateCreateEvent = new CalculateCreateEvent();
        BeanUtils.copyProperties(calculateCommand, calculateCreateEvent);
        AggregateLifecycle.apply(calculateCreateEvent);
    }
    @EventSourcingHandler
    public void on(CalculateCreateEvent calculateCreateEvent){
        this._id = calculateCreateEvent.get_id();
        this.distance = calculateCreateEvent.getDistance();
        this.oil_Price = calculateCreateEvent.getOil_Price();
        this.km_per_oil = calculateCreateEvent.getKm_per_oil();
    }
}
