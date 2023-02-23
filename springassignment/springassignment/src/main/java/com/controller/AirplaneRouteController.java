package com.controller;

import com.model.AirplaneRoute;
import com.services.AirplaneRouteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/AirplaneRoute")
public class AirplaneRouteController {
         @Autowired
         AirplaneRouteService airplaneRouteService;
         private static final Logger logger = LoggerFactory.getLogger(AirplaneRouteController.class);
         @GetMapping
         public List<AirplaneRoute> getAirplaneRoutes() {
             logger.info("Airplanerouteslist");
             return airplaneRouteService.getAirplaneRoutes();
         }
         @PostMapping("/create")
         public AirplaneRoute create(@RequestBody AirplaneRoute airplaneRoute){
             logger.info("Create airplaneroute is invoked {}", airplaneRoute);
             return airplaneRouteService.create(airplaneRoute);
         }
         @GetMapping("{/routeid}")
         public AirplaneRoute getAirplaneRouteById(@PathVariable("routeid") int routeid){
             logger.info("getAirplaneRouteById is invoked with  routeId: {}",routeid);
             return airplaneRouteService.getAirplaneRouteById(routeid);

         }
         @PutMapping("/update")
         public  AirplaneRoute updateAirplaneRoute(@RequestBody AirplaneRoute airplaneRoute) {
             return airplaneRouteService.updateAirplaneRoute(airplaneRoute);

         }
         @DeleteMapping("{routeid}")
         public  AirplaneRoute deleteAirplaneRoute(@PathVariable("routeid") int routeid) {
             return airplaneRouteService.deleteAirplaneRoute(routeid);
         }



}
