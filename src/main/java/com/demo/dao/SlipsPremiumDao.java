package com.demo.dao;

import com.demo.model.Region;
import com.demo.model.SlipsPremium;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlipsPremiumDao extends MongoRepository<SlipsPremium, String> {

}
