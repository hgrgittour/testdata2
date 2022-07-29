package com.demo.dto;

import com.demo.model.*;
import lombok.Data;

@Data
public class InputDto {

    private Country country;
    private Region region;
    private GroupsCedant groupsCedant;


    private Branche branche;


    private SlipsPremium slipsPremium;
}
