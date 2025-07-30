package com.university.transport_management.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String startPoint;
    private String endPoint;
    private String timing; // e.g., Morning/Evening

    @ElementCollection
    private List<String> stops;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public List<String> getStops() {
        return stops;
    }

    public void setStops(List<String> stops) {
        this.stops = stops;
    }
}
