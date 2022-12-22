package com.example.test.command;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddFavCommand {
    private String _id;
    private String username;
    private String startName;
    private String destination;
    private double distance;
    private String oil;
}
