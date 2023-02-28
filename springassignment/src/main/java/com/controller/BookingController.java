package com.controller;

import com.model.Booking;
import com.services.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="Booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    private static final Logger logger = LoggerFactory.getLogger(BookingController.class);
    @GetMapping
    public List<Booking> gettickets() {
        logger.info("this is the ticketslist");
        return bookingService.gettickets();
    }
    @PostMapping("/create")
    public Booking create(@RequestBody Booking booking) {
        logger.info("create tickets is invoked {}",booking);
        return bookingService.create(booking);
    }
    @GetMapping("{/ticketid}")
    public Booking getTicketById(@PathVariable("ticketid") int ticketid) {
        logger.info("getTicketById is invoked with  ticketId: {}",ticketid);
        return bookingService.getTicketById(ticketid);
    }

    @PutMapping("/update")
    public Booking updateTicket(@RequestBody Booking booking) {
        return bookingService.updateTicket(booking);
    }
    @DeleteMapping("{/ticketid}")
    public Booking deleteTicket(@PathVariable("ticketid") int ticketid){
        return bookingService.deleteTicket(ticketid);
    }
}
