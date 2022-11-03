package com.jathiswar.hospital.controller;

import com.jathiswar.hospital.dao.PatientPaymentDetailRepository;
import com.jathiswar.hospital.entity.PatientPaymentDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PatientPaymentController {
    @Autowired
    private PatientPaymentDetailRepository patientPaymentDetailRepository;

    @RequestMapping(value="/addPatientPaymentDetail",method= RequestMethod.POST)
    public ResponseEntity<String> addPerson(@RequestBody PatientPaymentDetail patientPaymentDetail){
        patientPaymentDetailRepository.save(patientPaymentDetail);
        return ResponseEntity.status(HttpStatus.OK).body(patientPaymentDetail.toString());
    }
}

