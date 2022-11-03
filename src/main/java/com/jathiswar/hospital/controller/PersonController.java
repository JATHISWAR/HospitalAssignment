package com.jathiswar.hospital.controller;

import com.jathiswar.hospital.dao.PersonRepository;
import com.jathiswar.hospital.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PersonController {
    @Autowired
    private PersonRepository personrepo;

    @RequestMapping(value="/addPerson",method= RequestMethod.POST)
    public ResponseEntity<String> addPerson(@RequestBody Person person){
        personrepo.save(person);
        return ResponseEntity.status(HttpStatus.OK).body(person.toString());
    }
}
