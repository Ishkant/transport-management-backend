package com.university.transport_management.service;

import com.university.transport_management.model.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle createVehicle(Vehicle vehicle);
    Vehicle getVehicleById(Long id);
    List<Vehicle> getAllVehicles();
    Vehicle updateVehicle(Long id, Vehicle vehicle);
    void deleteVehicle(Long id);
}
