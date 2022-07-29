package com.demo.service;

import com.demo.dto.InputDto;
import com.demo.dto.ResultDto;
import com.demo.model.Branche;
import com.demo.model.CaseNotLifePremium;
import com.demo.model.Country;

import java.util.List;

public interface QueryService {

    List<ResultDto> listAllByMongoTemlate(InputDto inputDto);
}
