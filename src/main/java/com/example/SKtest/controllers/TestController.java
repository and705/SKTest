package com.example.SKtest.controllers;

import com.example.SKtest.models.JsonRequest;
import com.example.SKtest.models.SkExampleTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.SKtest.service.TestService;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class TestController {

    @Autowired
    TestService testService;


    @GetMapping("/all")
    public String all() {
        return testService.findAll().toString();

    }

    @PostMapping("/modify")
    public ResponseEntity<?> modify(@RequestBody JsonRequest request) {
        System.out.println("id " + request.getId());
        System.out.println("add " + request.getAdd());
        try {
            SkExampleTable skExampleTable = testService.findById(request.getId());
            int newCurrent = skExampleTable.getObj().getCurrent() + request.getAdd();
            skExampleTable.getObj().setCurrent(newCurrent);
            testService.save(skExampleTable);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(testService.findById(request.getId()).getObj());
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}




