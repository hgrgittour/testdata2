package com.demo.dao;

import com.demo.model.Branche;
import com.demo.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrancheDao extends MongoRepository<Branche, String> {

}
