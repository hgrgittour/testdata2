package com.demo.model;

import com.mongodb.BasicDBObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.StringUtils;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("countries")
public class Country {

    @Id
    private ObjectId id;

    private String code;

    private String name;

    private String regions_id;

    private String updated_at;

    private String created_at;

    public Query createQuery(){
        Query query = new Query();
        if (!StringUtils.isEmpty(id)){
            query.addCriteria(Criteria.where("id").is(id));
        }
        if (!StringUtils.isEmpty(code)){
            query.addCriteria(Criteria.where("code").is(code));
        }
        if (!StringUtils.isEmpty(name)){
            query.addCriteria(Criteria.where("name").is(name));
        }

        return query;
    }
}
