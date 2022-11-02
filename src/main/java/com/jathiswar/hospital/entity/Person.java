package com.jathiswar.hospital.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person",uniqueConstraints = {@UniqueConstraint(columnNames = {"aadhar_no"})})
@Data
public class Person {

    @Id
    @Column(name = "aadhar_no")
    private long aadharNo;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;


    @Column(name = "dob")
    private Date dob;

    @Column(name="gender")
    private String gender;

    @Column(name = "phone")
    private long phone;

    @Column(name = "type")
    private String type;

}