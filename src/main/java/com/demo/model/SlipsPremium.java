package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document("slips_premium")
public class SlipsPremium {

    @Id
    private String id;
    private String approval_status;
    private String cedants_id;
    private String cedants_type_id;
    private String commission_refunded_total;

    private String confirmation_date;
    private String confirmation_status;

    private String created_at;
    private String edited_period;
    private String file_url;
    private String invoice_premium_total;
    private Integer is_paid;
    private String net_amount_total;
    private String published_date;

    private String reference;
    private String reinsurances_id;
    private String slip_type;
    private Integer update_progress;
    private Integer update_status;
    private String updated_at;
    private String user_cedant_id;
    private String validation_date;
    private String validation_status;
    private Integer warnings_saved;
    //warnings
}
//class Warnings{
//    List<>
//}
