package com.jathiswar.hospital.controller;

import com.jathiswar.hospital.dao.DoctorPatientDetailsRepository;
import com.jathiswar.hospital.dao.PersonRepository;
import com.jathiswar.hospital.entity.DoctorPatientDetails;
import com.jathiswar.hospital.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class DoctorPatientDetailsController {
    @Autowired
    private DoctorPatientDetailsRepository doctorPatientDetailsRepo;

    @RequestMapping(value="/addPerson",method= RequestMethod.POST)
    public ResponseEntity<String> addPerson(@RequestBody DoctorPatientDetails doctorPatientDetails){
        doctorPatientDetailsRepo.save(doctorPatientDetails);
        return ResponseEntity.status(HttpStatus.OK).body(doctorPatientDetails.toString());
    }
}
