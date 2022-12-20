package com.example.test.command.rest;

import lombok.Data;

@Data
public class CreateAccountRestModel {
    private String _id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
}
