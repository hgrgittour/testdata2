package com.demo.dao;

import com.demo.model.Branche;
import com.demo.model.Cedant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CedantDao extends MongoRepository<Cedant, String> {

}
