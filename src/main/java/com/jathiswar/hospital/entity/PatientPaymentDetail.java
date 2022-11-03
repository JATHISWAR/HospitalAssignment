package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "patientpaymentdetails")
@Data
public class PatientPaymentDetail {

    @Id
    @Column(name = "patient_aadhar_no")
    private long patientAadharNo;

    @Column(name="credit_card_no")
    private long creditCardNo;

    @Column(name = "valid_till")
    private Date validTill;


}
