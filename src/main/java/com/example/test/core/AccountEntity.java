package com.example.test.core;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

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
}
