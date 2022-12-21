package com.example.test.core.data;

import com.example.test.core.FavOilEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavOilRepository extends MongoRepository<FavOilEntity, String> {
    FavOilEntity findByAccountId(String accountId);
}
