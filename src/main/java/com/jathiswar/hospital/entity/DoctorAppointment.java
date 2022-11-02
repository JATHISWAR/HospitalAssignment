package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="doctorappointment")
@Data
public class DoctorAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctoraadharNo")
    private int doctoraadharNo;

    @Column(name = "patientaadharNo")
    private int patientaadharNo;

    @Column(name = "appointmentno")
    private int appointmentno;

    @Column(name = "appointmentdate")
    private Date appointmentdate;

    @Column(name = "fromtime")
    private Time fromtime;

    @Column(name = "status")
    private String status;

}
