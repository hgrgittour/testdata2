package com.demo.dao;

import com.demo.model.Branche;
import com.demo.model.Region;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionDao extends MongoRepository<Region, String> {

}
