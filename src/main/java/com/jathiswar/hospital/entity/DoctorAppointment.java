package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="doctorappointments",uniqueConstraints = {@UniqueConstraint(columnNames = {"doctor_aadhar_no"})})
@Data
public class DoctorAppointment {

    @Id
    @Column(name = "doctor_aadhar_no")
    private long doctorAadharNo;

    @Column(name = "patient_aadhar_no")
    private long patientAadharNo;

    @Column(name = "appointment_no")
    private long appointmentNo;

    @Column(name = "appointment_date")
    private Date appointmentDate;

    @Column(name = "from_time")
    private Time fromTime;

    @Column(name = "status")
    private String status;

}
