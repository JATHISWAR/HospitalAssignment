package com.jathiswar.hospital;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.html.parser.Entity;

public class BaseController {


    @Autowired
    private BaseRepository baseRepo;

    public ResponseEntity<String> add(@RequestBody Entity entity){
        baseRepo.save(entity);
        return ResponseEntity.status(HttpStatus.OK).body(entity.toString());
    }
}
