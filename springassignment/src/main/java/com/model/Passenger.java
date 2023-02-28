package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @Column(name = "passengerid")
    private int passengerId;
    @Column(name = "passengername")
    private String passengerName;
    @Column(name = "location")
    private String location;
    @Column(name = "DOB")
    private Date dob;

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Passenger{");
        sb.append("passengerId=").append(passengerId);
        sb.append(", passengerName='").append(passengerName).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", dob=").append(dob);
        sb.append('}');
        return sb.toString();
    }
}
