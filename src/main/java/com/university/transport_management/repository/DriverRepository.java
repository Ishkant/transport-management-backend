package com.university.transport_management.repository;

import com.university.transport_management.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    List<Driver> findByLicenseNumber(String licenseNumber);
}
