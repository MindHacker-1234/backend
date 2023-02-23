package com.controller;

import com.model.Passenger;
import com.services.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Passenger")
public class PassengerController {
    @Autowired
    PassengerService passengerService;
    private static final Logger logger = LoggerFactory.getLogger(PassengerController.class);
    @GetMapping
    public List<Passenger> getPassengers() {
        logger.info("Passengerslist");
        return passengerService.getPassengers();
    }
    @PostMapping("/create")
    public Passenger create(@RequestBody Passenger passenger) {
                logger.info("the created method is invoked {}", passenger);
                return passengerService.create(passenger);
    }

    @GetMapping("{/passengerid}")
    public Passenger getPassengerById(@PathVariable("passengerid") int passengerid) {
        logger.info("getPassengerById is invoked with  passengerid: {}",passengerid);
        return passengerService.getPassengerById(passengerid);
    }
    @PutMapping("/update")
    public Passenger updatePassenger(@RequestBody Passenger passenger) {
              return passengerService.updatePassenger(passenger);
    }

    @DeleteMapping("/passengerid")
    public Passenger deletePassenger(@PathVariable("passengerid") int passengerid) {
        return passengerService.deletePassenger(passengerid);
    }



}
