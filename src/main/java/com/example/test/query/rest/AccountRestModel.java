package com.example.test.query.rest;

import lombok.Data;

@Data
public class AccountRestModel {
    private String _id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
}
