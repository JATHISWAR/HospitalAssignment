package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "doctorpatientdetails",uniqueConstraints = {@UniqueConstraint(columnNames = {"doctor_aadhar_no"})})
@Data
public class DoctorPatientDetails {

    @Id
    @Column(name = "doctor_aadhar_no")
    private long doctorAadharNo;

    @Column(name = "patient_aadhar_no")
    private long patientAadharNo;

    @Column(name = "reason")
    private String reason;

}
