package com.example.test.core.data;

import com.example.test.core.AccountEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  AccountRepository extends MongoRepository<AccountEntity, String> {
    @Query(value = "{username: '?0'}")
    AccountEntity findByUsername(String username);
}
