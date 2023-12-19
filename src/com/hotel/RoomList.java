package com.hotel;

import com.hotel.Guest;
import com.hotel.Room.RoomType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RoomList {
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Room> occupiedRooms = new ArrayList<>();
    private int size;

    private static Room[] roomArray = { new Room(1, RoomType.ONEBED), new Room(2, RoomType.ONEBED),
            new Room(3, RoomType.TWOBED), new Room(4, RoomType.ONEBED), new Room(5, RoomType.TWOBED),
            new Room(6, RoomType.THREEBED), new Room(7, RoomType.THREEBED), new Room(8, RoomType.TWOBED),
            new Room(9, RoomType.ONEBED), new Room(10, RoomType.ONEBED), new Room(11, RoomType.ONEBED),
            new Room(12, RoomType.ONEBED), new Room(13, RoomType.ONEBED), new Room(14, RoomType.TWOBED),
            new Room(15, RoomType.SUITE) };

    public RoomList() {
        // this.rooms = RoomList.roomArray;
        ArrayList<Room> rooms = new ArrayList<>(Arrays.asList(roomArray));

    }

    public void occupyRoom(int number) {
        // retrieve room type using room number and do .add with both pieces of data
        // this.occupiedRooms.add(number);
        System.out.println(this);
    }

    public void unoccupyRoom(int roomNumber) {
        Iterator<Room> iterator = this.occupiedRooms.iterator();
        while (iterator.hasNext()) {
            Room instance = iterator.next();
            if (instance.getNumber() == roomNumber) {
                iterator.remove();
                break; // Remove only the first occurrence
            }
        }
    }

    public void displayOccupiedRooms() {
        for (Room room : occupiedRooms) {
            System.out.println("roomNo=" + room.getNumber() + ", roomType=" + room.getType().toString());
        }
    }

    public static void displayAllRooms() {
        // simulate database fetch
        for (Room room : roomArray) {
            System.out.println("roomNo=" + room.getNumber() + ", roomType=" + room.getType().toString());
        }
    }
}