package com.hms.controller;

import com.hms.model.request.BloodRequest;
import com.hms.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blood")
public class BloodController {

    @Autowired
    BloodService bloodService;

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody BloodRequest request){
       String response = bloodService.add(request);
       return ResponseEntity.ok().body(response);
    }
}
