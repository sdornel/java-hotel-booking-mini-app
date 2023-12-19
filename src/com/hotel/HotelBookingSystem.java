package com.hotel;

import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        GuestList guestList = new GuestList();
        while (!exit) {
            System.out.println("Hotel Booking System Menu");
            System.out.println("1: Check-in");
            System.out.println("2: Check-out");
            System.out.println("3: View occupied rooms");
            System.out.println("4: View guest list");
            System.out.println("5: View all rooms");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Guest guest = new Guest(null);
            switch (choice) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    System.out.println("Enter room number: ");
                    int roomNumber = scanner.nextInt();

                    guest.setName(guestName);
                    // add to guest list and mark room as occupied
                    guestList.addGuest(guest);
                    RoomList.occupyRoom(roomNumber, guestName);
                    System.out.println(guestName + " has completed checkin for room #" + roomNumber);
                    System.out.println();
                    break;
                }
                case 2 -> {
                    System.out.println();
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();

                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();

                    // remove from guest list and mark room as available
                    guestList.removeGuest(guestName);
                    RoomList.unoccupyRoom(roomNumber);

                    System.out.println(guestName + " has completed checkout for room #" + roomNumber);
                    System.out.println();
                    break;
                }
                case 3 -> {
                    System.out.println("Displaying occupied rooms...");
                    RoomList.displayOccupiedRooms();
                    break;
                }
                case 4 -> {
                    System.out.println("List of guests: ");
                    guestList.displayGuests();
                    break;
                }
                case 5 -> {
                    System.out.println("Displaying all rooms...");
                    System.out.println("Accessing data...");
                    RoomList.displayAllRooms();
                    break;
                }
                case 6 -> {
                    System.out.println("Exiting Hotel Booking System. Goodbye!");
                    exit = true;
                    break;
                }
            }
        }
        scanner.close();
    }
}
