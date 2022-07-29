package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("cedants")
public class Cedant {

    @Id
    private ObjectId id;
    private String benefit_percentage;
    private String code;
    private String color1;
    private String color2;
    private String contact;

    private String countries_id;
    private String created_at;

    private String currencies_id;
    private String email;
    private String estimation_type;
    private String groups_cedants_id;
    private String logo;
    private String name;
    private String region_id;

    private String reinsurances_id;
    private String types_cedants_id;
    private String updated_at;

}
