package com.example.test.command.event;

import lombok.Data;

@Data
public class FavDeleteEvent {
    private String _id;
    private String username;
    private String startName;
    private String destination;
    private double distance;
    private String oil;
}
