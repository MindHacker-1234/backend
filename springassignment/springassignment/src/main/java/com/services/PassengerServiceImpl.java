package com.services;

import com.model.Booking;
import com.model.Passenger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PassengerServiceImpl implements PassengerService{
    @Autowired
    private SessionFactory sessionFactory;
    public List<Passenger> getPassengers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Passenger> passengerList = session.createQuery("from Passenger", Passenger.class).list();
        transaction.commit();
        session.close();
        return passengerList;
    }

    public Passenger create(Passenger passenger) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(passenger);
        transaction.commit();
        session.close();
        return passenger;
    }

    public Passenger getPassengerById(int passengerid) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Passenger passenger = session.get(Passenger.class, passengerid);
        transaction.commit();
        session.close();
        return passenger;
    }

    public Passenger updatePassenger(Passenger passenger) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(passenger);
        transaction.commit();
        session.close();
        return passenger;
    }

    public Passenger deletePassenger(int passengerid) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Passenger passenger= session.get(Passenger.class, passengerid);
        transaction.commit();
        session.close();
        return passenger;
    }
}
