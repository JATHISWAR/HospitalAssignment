package com.jathiswar.hospital.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "doctordetails",uniqueConstraints = {@UniqueConstraint(columnNames = {"aadhar_no"})})
@Data
public class DoctorDetails {

    @Id
    @Column(name = "aadhar_no")
    private long aadharNo;


    @Column(name = "qualification")
    private String qualification;


    @Column(name = "date_of_passing")
    private Date dateOfPassing;

    @Column(name = "fees")
    private int fees;

}