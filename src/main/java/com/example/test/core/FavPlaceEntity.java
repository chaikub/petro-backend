package com.example.test.core;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document("Place")
public class FavPlaceEntity implements Serializable {
    @Id
    private String _id;
    private String placeName;
    private String accountId;
}
