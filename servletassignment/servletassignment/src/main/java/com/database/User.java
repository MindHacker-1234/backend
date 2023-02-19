package com.database;

public class User {
    private String firstName;
    private String lastName;
    private String location;
    private String phno;
    public User(String firstName, String lastName, String location, String phno) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.phno = phno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

