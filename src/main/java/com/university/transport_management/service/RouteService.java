package com.university.transport_management.service;

import com.university.transport_management.model.Route;
import java.util.List;

public interface RouteService {
    Route createRoute(Route route);
    Route getRouteById(Long id);
    List<Route> getAllRoutes();
    Route updateRoute(Long id, Route route);
    void deleteRoute(Long id);
}
