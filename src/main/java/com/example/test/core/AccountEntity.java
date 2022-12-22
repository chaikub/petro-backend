package com.example.test.core;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@Document("Account")
public class AccountEntity implements Serializable {
    @Id
    private String _id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private List<String> favoil;
}
