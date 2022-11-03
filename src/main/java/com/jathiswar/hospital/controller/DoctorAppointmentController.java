package com.jathiswar.hospital.controller;

import com.jathiswar.hospital.dao.DoctorAppointmentRepository;
import com.jathiswar.hospital.dao.DoctorDetailsRepository;
import com.jathiswar.hospital.entity.DoctorAppointment;
import com.jathiswar.hospital.entity.DoctorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorAppointmentController {
    @Autowired
    private DoctorAppointmentRepository repository;


    @RequestMapping(value = "/addDoctorAppointment", method = RequestMethod.POST)
    public ResponseEntity<String> addPerson(@RequestBody DoctorAppointment appointment) {
        repository.save(appointment);
        return ResponseEntity.status(HttpStatus.OK).body(appointment.toString());


    }


}