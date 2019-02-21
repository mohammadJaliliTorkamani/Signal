package com.seeds.signal.Entity;

public class Direction {
    private int id;
    private int userID;
    private int startMarkerID;
    private int endMarkerID;
    private String calendar;

    public Direction(int id, int userID, int startMarkerID, int endMarkerID, String calendar) {
        this.id = id;
        this.userID = userID;
        this.startMarkerID = startMarkerID;
        this.endMarkerID = endMarkerID;
        this.calendar = calendar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getStartMarkerID() {
        return startMarkerID;
    }

    public void setStartMarkerID(int startMarkerID) {
        this.startMarkerID = startMarkerID;
    }

    public int getEndMarkerID() {
        return endMarkerID;
    }

    public void setEndMarkerID(int endMarkerID) {
        this.endMarkerID = endMarkerID;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }
}
