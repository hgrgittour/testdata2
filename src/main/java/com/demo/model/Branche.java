package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("branches")
public class Branche {

    @Id
    private String id;

    private ArrayList<String> alias;

    private String code;
    private String created_at;
    private Integer is_parent;

    private String name;
    private String parent_branch_id;
    private Integer status;

    private String type;//not life   life

    private String updated_at;

}
