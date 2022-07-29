package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("groups_cedants")
public class GroupsCedant {

    @Id
    private String id;

    private String name;

    private String updated_at;

    private String created_at;
}
