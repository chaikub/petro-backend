package com.example.test.command.rest;

import com.example.test.command.CreateAccountCommand;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountCommandController {
    @PostMapping
    public void createAccount(@RequestBody CreateAccountRestModel model){
        CreateAccountCommand command = CreateAccountCommand.builder()
                .username(model.getUsername())
                .password(model.getPassword())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .phone(model.getPhone())
                .build();
        String result;
    }

    @DeleteMapping("/{id}")
    public void deleteBeer(@PathVariable String id) {
//        beerService.deleteQuery(id);
    }
}
