package com.example.test.core.data;

import com.example.test.core.FavPlaceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavPlaceRepository extends MongoRepository<FavPlaceEntity, String> {
    FavPlaceEntity findByAccountId(String accountId);
}
