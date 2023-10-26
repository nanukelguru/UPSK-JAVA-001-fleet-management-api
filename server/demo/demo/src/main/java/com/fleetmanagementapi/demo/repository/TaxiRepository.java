package com.fleetmanagementapi.demo.repository;

import com.fleetmanagementapi.demo.models.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
    Optional<Taxi> findById(int i);
}