package com.jathiswar.hospital.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "doctorpatientdetails")
@Getter
@Setter
@IdClass(DoctorPatientID.class)
public class DoctorPatientDetails {

    @Id
    @Column(name = "doctor_aadhar_no")
    private long doctorAadharNo;

    @Column(name = "patient_aadhar_no")
    private long patientAadharNo;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "doctor_aadhar_no",insertable = false,updatable = false)
    private Person doctor;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "patient_aadhar_no",insertable = false,updatable = false)
    private Person patient;

    @Column(name = "reason")
    private String reason;

}
