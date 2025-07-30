package com.university.transport_management.serviceImpl;

import com.university.transport_management.model.Vehicle;
import com.university.transport_management.repository.VehicleRepository;
import com.university.transport_management.service.VehicleService;
import com.university.transport_management.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found with ID: " + id));
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle updatedVehicle) {
        Vehicle existingVehicle = getVehicleById(id);
        existingVehicle.setModel(updatedVehicle.getModel());
        // --- CHANGE THIS LINE ---
        existingVehicle.setRegistrationNumber(updatedVehicle.getRegistrationNumber()); // Changed from setNumberPlate/getNumberPlate
        // Add other fields from your Vehicle model as needed:
        existingVehicle.setCapacity(updatedVehicle.getCapacity());
        existingVehicle.setRoute(updatedVehicle.getRoute());
        return vehicleRepository.save(existingVehicle);
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}