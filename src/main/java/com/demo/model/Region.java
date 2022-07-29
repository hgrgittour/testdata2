package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("regoin")
public class Region {

    @Id
    private String id;

    private String code;

    private String name;

    private String updated_at;
}
