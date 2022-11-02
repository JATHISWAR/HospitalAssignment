package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "doctorpatientdetails")
@Data
public class DoctorPatientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctoraadharNo")
    private int doctoraadharNo;

    @Column(name = "patientaadharNo")
    private int patientaadharNo;

    @Column(name = "reason")
    private int appointmentno;

}
