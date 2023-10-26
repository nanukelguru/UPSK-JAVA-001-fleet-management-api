package com.fleetmanagementapi.demo.controllers;
import com.fleetmanagementapi.demo.models.Taxi;
import com.fleetmanagementapi.demo.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
@RequestMapping("taxis")
public class TaxiController {
    @Autowired
    private TaxiRepository repository;
    @GetMapping("/")
    public Optional<Taxi> list(){
        return repository.findById(1);
    }
}
