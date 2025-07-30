package com.university.transport_management.model;

import jakarta.persistence.Entity;

@Entity
public class Student extends User {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
