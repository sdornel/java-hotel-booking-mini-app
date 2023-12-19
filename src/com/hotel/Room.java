package com.hotel;

public class Room {
    private int number;
    private RoomType type;
    
    public enum RoomType {
        ONEBED, TWOBED, THREEBED, SUITE
    }

    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}