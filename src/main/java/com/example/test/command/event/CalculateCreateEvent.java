package com.example.test.command.event;

import lombok.Data;

@Data
public class CalculateCreateEvent {
    private String _id;
    private double distance;
    private double oil_Price;
    private double km_per_oil;
}
