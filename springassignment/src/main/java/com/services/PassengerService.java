package com.services;

import com.model.Passenger;

import java.util.List;

public interface PassengerService {

    List<Passenger> getPassengers();

    Passenger create(Passenger passenger);

    Passenger getPassengerById(int passengerid);

    Passenger updatePassenger(Passenger passenger);
    Passenger deletePassenger(int passengerid);
}
