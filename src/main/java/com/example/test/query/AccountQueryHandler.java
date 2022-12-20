package com.example.test.query;

import com.example.test.core.AccountEntity;
import com.example.test.core.data.AccountRepository;
import com.example.test.query.rest.AccountRestModel;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountQueryHandler {
    private final AccountRepository accountRepository;

    public AccountQueryHandler(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @QueryHandler
    List<AccountRestModel> findAccounts(FindAccountQuery query){
        List<AccountRestModel> productRest = new ArrayList<>();
        List<AccountEntity> storedProducts = accountRepository.findAll();
        for (AccountEntity accountEntity : storedProducts){
            AccountRestModel productRestModel = new AccountRestModel();
            BeanUtils.copyProperties(accountEntity, productRestModel);
            productRest.add(productRestModel);
        }
        return productRest;
    }
}
