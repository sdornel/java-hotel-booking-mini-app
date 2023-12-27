package com.hotel;

import com.hotel.Room.RoomType;

public class RoomList {

    private static Room[] roomArray = { new Room(1, RoomType.ONEBED, null), new Room(2, RoomType.ONEBED, null),
            new Room(3, RoomType.TWOBED, null), new Room(4, RoomType.ONEBED, null), new Room(5, RoomType.TWOBED, null),
            new Room(6, RoomType.THREEBED, null), new Room(7, RoomType.THREEBED, null), new Room(8, RoomType.TWOBED, null),
            new Room(9, RoomType.ONEBED, null), new Room(10, RoomType.ONEBED, null), new Room(11, RoomType.ONEBED, null),
            new Room(12, RoomType.ONEBED, null), new Room(13, RoomType.ONEBED, null), new Room(14, RoomType.TWOBED, null),
            new Room(15, RoomType.SUITE, null) };

    public static void occupyRoom(int number, String guestName) {
        // retrieve room type using room number and do .add with both pieces of data
        roomArray[number-1].setGuestName(guestName);
    }

    public static void unoccupyRoom(int number, String guestName) throws Exception {
        if (roomArray[number-1].getGuestName() != guestName) {
            throw new Exception();
        } else {
            roomArray[number-1].setGuestName(null);
        }
    }

    public static void displayOccupiedRooms() {
        System.out.println();
        for (Room room : roomArray) {
            if (room.getGuestName() != null) {
                System.out.println("roomNo=" + room.getNumber() + ", roomType=" + room.getType().toString() + ", guestName=" + room.getGuestName());
            }
        }
        System.out.println();
    }

    public static void displayAllRooms() {
        // simulate database fetch
        for (Room room : roomArray) {
            System.out.println("roomNo=" + room.getNumber() + ", roomType=" + room.getType().toString() + ", guestName=" + room.getGuestName());
        }
        System.out.println();
    }
}