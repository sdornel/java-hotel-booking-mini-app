package com.hotel;

public class Room {
    private int number;
    private RoomType type;
    private String guestName;
    
    public enum RoomType {
        ONEBED, TWOBED, THREEBED, SUITE
    }

    public Room(int number, RoomType type, String guestName) {
        this.number = number;
        this.type = type;
        this.guestName = null;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    public String getGuestName() {
        return guestName;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}