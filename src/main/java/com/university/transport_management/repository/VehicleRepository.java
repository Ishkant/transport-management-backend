package com.university.transport_management.repository;

import com.university.transport_management.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByType(String type);
    List<Vehicle> findByCapacityGreaterThanEqual(int capacity);
}
