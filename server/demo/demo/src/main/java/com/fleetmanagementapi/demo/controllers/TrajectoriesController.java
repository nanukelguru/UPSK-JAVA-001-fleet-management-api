package com.fleetmanagementapi.demo.controllers;

import com.fleetmanagementapi.demo.models.Taxi;
import com.fleetmanagementapi.demo.models.Trajectories;
import com.fleetmanagementapi.demo.repository.TaxiRepository;
import com.fleetmanagementapi.demo.repository.TrajectoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("trajectories")

public class TrajectoriesController {
    @Autowired
    private TrajectoriesRepository repository;
    @GetMapping("/")
    public List<Trajectories> list(@RequestParam Integer taxi_id) {
        return repository.listTrajectories(taxi_id);
    }

    @GetMapping("/last")
    public List<Trajectories> listLastTrajectoriesByTaxi() {
        List<Trajectories> trajectoriesList = this.repository.findAll();
        for (Trajectories trajectory: trajectoriesList ){
            System.out.println((trajectory.getTaxi().getLicense()));
        }
        return trajectoriesList;
    }

}

