package com.demo.dto;

import lombok.Data;

@Data
public class ResultDto {
    private String reference;
    private String countryName;
    private String cedantName;
    private String validationStatus;
    private String confirmationStatus;
    private String publicationDate;
    private String branchName;
    private Double calculatedREC;
}
