package com.jathiswar.hospital.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person")
@Getter
@Setter
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

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DoctorPatientDetails> doctorDetails = new HashSet<>();

    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DoctorPatientDetails> patientDetails = new HashSet<>();

}