package com.example.test.command;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CalculateCommand {
    private double distance;
    private double oil_Price;
    private double km_per_oil;
}
