package com.demo.controller;

import com.demo.dto.InputDto;
import com.demo.dto.ResultDto;
import com.demo.dto.common.ResultVO;
import com.demo.model.Branche;
import com.demo.model.CaseNotLifePremium;
import com.demo.model.Country;
import com.demo.service.CountryService;
import com.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private QueryService queryService;


    @GetMapping("/list2")
    public ResultVO< List<ResultDto>> getCountrysBymongto() {
        InputDto inputDto = new InputDto();
        return ResultVO.success(
                queryService.listAllByMongoTemlate(inputDto)
        );
    }

}
