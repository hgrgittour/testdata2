package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document("case_not_life_premium")
public class CaseNotLifePremium {

    @Id
    private String id;
    private Integer active_status;
    private String branch;
    private String branches_id;
    private String case_validation_status;
    private String case_variant;

    private String category;
    private String cedants_id;

    private String commission_cession;
    private String commission_refunded;
    private String date_effective;
    private String date_transaction;
    private String deadline;
    private String insured_capital;

    private String invoiced_premium;
    private String nature_risque_id;
    private String net_amount;
    private String paid_commission;
    private Integer part_cedant_coass;
    private String policy_number;
    private Integer premium_ceded;
    private Double premium_ht;
    private Integer prime_net_ceded;

    private String slipes_prime_id;
    private String sub_branches_id;
    private String updated_at;
    private Double totalht;
    private List<SlipsPremium> slipsPremium;
    //warnings
}
//class Warnings{
//    List<>
//}
