package com.demo.dao;

import com.demo.model.Branche;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseNotLifePremiumDao extends MongoRepository<CaseNotLifePremiumDao, String> {

}
