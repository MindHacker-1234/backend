package com.services;

import com.model.AirplaneRoute;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirplaneRouteServiceImpl implements AirplaneRouteService{
    @Autowired
    private SessionFactory sessionFactory;

    public List<AirplaneRoute> getAirplaneRoutes() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<AirplaneRoute> AirplaneRouteList = session.createQuery("from AirplaneRoute", AirplaneRoute.class).list();
        transaction.commit();
        session.close();
        return AirplaneRouteList;
    }

    public AirplaneRoute create(AirplaneRoute airplaneRoute) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(airplaneRoute);
        transaction.commit();
        session.close();
        return airplaneRoute;
    }

    public AirplaneRoute getAirplaneRouteById(int routeid) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        AirplaneRoute airplaneRoute = session.get(AirplaneRoute.class, routeid);
        transaction.commit();
        session.close();
        return airplaneRoute;
    }

    public AirplaneRoute updateAirplaneRoute(AirplaneRoute airplaneRoute) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(airplaneRoute);
        transaction.commit();
        session.close();
        return airplaneRoute;
    }

    public AirplaneRoute deleteAirplaneRoute(int routeid) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        AirplaneRoute airplaneRoute = session.get(AirplaneRoute.class, routeid);
        session.delete(airplaneRoute);
        transaction.commit();
        session.close();
        return airplaneRoute;
    }
}
