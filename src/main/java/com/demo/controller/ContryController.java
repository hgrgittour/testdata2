package com.demo.controller;

import com.demo.dto.common.ResultVO;
import com.demo.model.Country;
import com.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class ContryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/list")
    public ResultVO<List<Country>> getCountrys() {
        return ResultVO.success(countryService.listAll());
    }

}
