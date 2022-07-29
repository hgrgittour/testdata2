package com.demo.service.impl;

import com.demo.dao.CountryDao;
import com.demo.model.Country;
import com.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;


    @Override
    public List<Country> listAll() {
        return countryDao.findAll();
    }
}
