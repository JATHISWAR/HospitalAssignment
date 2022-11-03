package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patientpaymentdetails")
@Data
public class PatientPaymentDetail {

    @OneToOne
    @Id
    @Column(name = "patient_aadhar_no")
    private long patientAadharNo;

    @Column(name="credit_card_no")
    private long creditCardNo;

    @Column(name = "valid_till")
    private Date validTill;


    @OneToMany(mappedBy = "patientPayment",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DoctorPatientDetails> patientDetails = new HashSet<>();

}
