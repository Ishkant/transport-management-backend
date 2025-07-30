package com.university.transport_management.serviceImpl;

import com.university.transport_management.model.Driver;
import com.university.transport_management.repository.DriverRepository;
import com.university.transport_management.service.DriverService;
import com.university.transport_management.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Driver getDriverById(Long id) {
        return driverRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Driver not found with ID: " + id));
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver updateDriver(Long id, Driver updatedDriver) {
        Driver existingDriver = getDriverById(id);
        existingDriver.setLicenseNumber(updatedDriver.getLicenseNumber());
        existingDriver.setName(updatedDriver.getName());
        // Add more fields as needed
        return driverRepository.save(existingDriver);
    }

    @Override
    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);
    }
}
