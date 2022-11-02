package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "patientpaymentdetails")
@Data
public class PatientPaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientaadharNo")
    private int patientaadharNo;

    @Column(name="creditcardNo")
    private int creditcardno;

    @Column(name = "validtill")
    private Date validtill;


}
