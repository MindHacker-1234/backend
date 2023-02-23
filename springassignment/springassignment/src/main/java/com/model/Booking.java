package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @Column(name = "ticketid")
    private int ticketId;
    @Column(name = "ticketamount")
    private int ticketamount;
    @Column(name = "ticketStatus")
    private String ticketStatus;
    @Column(name = "passengerid")
    private int passengerId;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketamount() {
        return ticketamount;
    }

    public void setTicketamount(int ticketamount) {
        this.ticketamount = ticketamount;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Booking{");
        sb.append("ticketId=").append(ticketId);
        sb.append(", ticketamount=").append(ticketamount);
        sb.append(", ticketStatus='").append(ticketStatus).append('\'');
        sb.append(", passengerId=").append(passengerId);
        sb.append('}');
        return sb.toString();
    }
}
