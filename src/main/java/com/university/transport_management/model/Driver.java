package com.university.transport_management.model;

import jakarta.persistence.*;

@Entity
public class Driver extends User {

    private String licenseNumber;

    @OneToOne
    private Vehicle assignedVehicle;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Vehicle getAssignedVehicle() {
        return assignedVehicle;
    }

    public void setAssignedVehicle(Vehicle assignedVehicle) {
        this.assignedVehicle = assignedVehicle;
    }
}
