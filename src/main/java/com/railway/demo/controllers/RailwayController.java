package com.railway.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RailwayController {
    public RailwayController() {
    }

    @GetMapping("/")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/error")
    public ResponseEntity<String> getError() {
        return new ResponseEntity<String>("Error!", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
