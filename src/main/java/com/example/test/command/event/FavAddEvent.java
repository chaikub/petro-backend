package com.example.test.command.event;

import lombok.Data;
import org.axonframework.modelling.command.AggregateIdentifier;

@Data
public class FavAddEvent {
    private String _id;
    private String username;
    private String startName;
    private String destination;
    private double distance;
    private String oil;
}
