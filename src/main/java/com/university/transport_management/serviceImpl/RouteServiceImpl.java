package com.university.transport_management.serviceImpl;

import com.university.transport_management.model.Route;
import com.university.transport_management.repository.RouteRepository;
import com.university.transport_management.service.RouteService;
import com.university.transport_management.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public Route getRouteById(Long id) {
        return routeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Route not found with ID: " + id));
    }

    @Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public Route updateRoute(Long id, Route updatedRoute) {
        Route existingRoute = getRouteById(id);
        // --- CHANGE THESE LINES ---
        existingRoute.setStartPoint(updatedRoute.getStartPoint());     // Changed from setSource/getSource
        existingRoute.setEndPoint(updatedRoute.getEndPoint());         // Changed from setDestination/getDestination
        // Add other fields from your Route model as needed:
        existingRoute.setTiming(updatedRoute.getTiming());
        existingRoute.setStops(updatedRoute.getStops());
        return routeRepository.save(existingRoute);
    }

    @Override
    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }
}