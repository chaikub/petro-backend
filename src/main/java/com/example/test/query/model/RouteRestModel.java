package com.example.test.query.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class RouteRestModel implements Serializable {
    private String startName;
    private String destination;
    private double distance;
    private String oil;
}
