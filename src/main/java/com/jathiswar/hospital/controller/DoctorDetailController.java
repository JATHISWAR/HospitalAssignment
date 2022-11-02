package com.jathiswar.hospital.controller;

import com.jathiswar.hospital.dao.DoctorDetailsRepository;
import com.jathiswar.hospital.entity.DoctorDetails;
import com.jathiswar.hospital.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorDetailController {
    @Autowired
    private DoctorDetailsRepository doctorDetailRepo;



}
