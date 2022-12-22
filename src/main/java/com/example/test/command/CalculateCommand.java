package com.example.test.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Builder
@Data
public class CalculateCommand {
    @TargetAggregateIdentifier
    private String _id;
    private double distance;
    private double oil_Price;
    private double km_per_oil;
}
