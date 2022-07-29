package com.demo.dao;

import com.demo.model.Cedant;
import com.demo.model.GroupsCedant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GourpsCedantDao extends MongoRepository<GroupsCedant, String> {

}
