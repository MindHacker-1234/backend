package com.services;

import com.model.AirplaneRoute;

import java.util.List;

public interface AirplaneRouteService {
    List<AirplaneRoute> getAirplaneRoutes();

    AirplaneRoute create(AirplaneRoute airplaneRoute);

    AirplaneRoute getAirplaneRouteById(int routeid);

    AirplaneRoute updateAirplaneRoute(AirplaneRoute airplaneRoute);
    AirplaneRoute deleteAirplaneRoute(int routeid);
}
