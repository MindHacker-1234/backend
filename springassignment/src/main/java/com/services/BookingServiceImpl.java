package com.services;

import com.controller.AirplaneRouteController;
import com.model.Booking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImpl implements BookingService{
    @Autowired
    private SessionFactory sessionFactory;

    public List<Booking> gettickets() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Booking> bookingList = session.createQuery("from Booking", Booking.class).list();
        transaction.commit();
        session.close();
        return bookingList;
    }

    public Booking create(Booking booking) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(booking);
        transaction.commit();
        session.close();
        return booking;
    }

    public Booking getTicketById(int ticketid) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Booking booking = session.get(Booking.class, ticketid);
        transaction.commit();
        session.close();
        return booking;
    }

    public Booking updateTicket(Booking booking) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(booking);
        transaction.commit();
        session.close();
        return booking;
    }

    public Booking deleteTicket(int ticketid) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Booking booking= session.get(Booking.class, ticketid);
        session.delete(booking);
        transaction.commit();
        session.close();
        return booking;
    }
}
