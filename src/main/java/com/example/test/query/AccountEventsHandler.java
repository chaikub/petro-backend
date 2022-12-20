package com.example.test.query;

import com.example.test.core.AccountEntity;
import com.example.test.core.data.AccountRepository;
import com.example.test.core.event.AccountCreateEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountEventsHandler {
    private final AccountRepository accountRepository;

    public AccountEventsHandler(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @EventHandler
    public void on(AccountCreateEvent event){
        AccountEntity accountEntity = new AccountEntity();
        BeanUtils.copyProperties(event, accountEntity);
        accountRepository.save(accountEntity);
    }
}
