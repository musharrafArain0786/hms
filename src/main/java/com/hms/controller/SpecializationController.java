package com.hms.controller;

import com.hms.model.request.SpecializationRequest;
import com.hms.service.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/specialization")
public class SpecializationController {

    @Autowired
    SpecializationService specializationService;

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody SpecializationRequest specializationRequest){
        String response = specializationService.add(specializationRequest);
        return ResponseEntity.ok().body(response);
    }
}
