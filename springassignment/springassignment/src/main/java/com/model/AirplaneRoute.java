package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airplaneroute")
public class AirplaneRoute {
    @Id
    @Column(name = "routeid")
    private int routeid;

    @Column(name = "startpt")
    private String startpt;
    @Column(name = "endpt")
    private String endpt;
    @Column(name = "ticketid")
    private int ticketid;

    public int getRouteid() {
        return routeid;
    }

    public void setRouteid(int routeid) {
        this.routeid = routeid;
    }

    public String getStartpt() {
        return startpt;
    }

    public void setStartpt(String startpt) {
        this.startpt = startpt;
    }

    public String getEndpt() {
        return endpt;
    }

    public void setEndpt(String endpt) {
        this.endpt = endpt;
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirplaneRoute{");
        sb.append("routeid=").append(routeid);
        sb.append(", startpt='").append(startpt).append('\'');
        sb.append(", endpt='").append(endpt).append('\'');
        sb.append(", ticketid=").append(ticketid);
        sb.append('}');
        return sb.toString();
    }
}
