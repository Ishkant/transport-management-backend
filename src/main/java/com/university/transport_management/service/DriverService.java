package com.university.transport_management.service;

import com.university.transport_management.model.Driver;
import java.util.List;

public interface DriverService {
    Driver createDriver(Driver driver);
    Driver getDriverById(Long id);
    List<Driver> getAllDrivers();
    Driver updateDriver(Long id, Driver driver);
    void deleteDriver(Long id);
}
