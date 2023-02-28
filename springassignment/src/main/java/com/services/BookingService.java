package com.services;

import com.controller.AirplaneRouteController;
import com.model.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> gettickets();

    Booking create(Booking booking);

    Booking getTicketById(int ticketid);

    Booking updateTicket(Booking booking);
    Booking deleteTicket(int ticketid);
}
