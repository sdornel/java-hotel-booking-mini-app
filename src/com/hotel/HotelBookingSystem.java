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
                    try {
                        System.out.println();
                        System.out.println("Enter guest name: ");
                        String guestName = scanner.nextLine();
                        if (!guestName.matches("[a-zA-Z]+")) {
                            throw new Exception();
                        }
                        System.out.println("Enter room number: ");
                        int roomNumber = scanner.nextInt();
    
                        guest.setName(guestName);
                        // add to guest list and mark room as occupied
                        guestList.addGuest(guest);
                        RoomList.occupyRoom(roomNumber, guestName);
                        System.out.println(guestName + " has completed checkin for room #" + roomNumber);
                        System.out.println();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please use only letters for the guest name and a number between 1 and 15 for room number");
                        scanner.nextLine();
                        continue;
                    }
                }
                case 2 -> {
                    try {
                        System.out.println();
                        System.out.print("Enter guest name: ");
                        String guestName = scanner.nextLine();
                        if (!guestName.matches("[a-zA-Z]+")) {
                            throw new Exception();
                        }
                        System.out.print("Enter room number: ");
                        int roomNumber = scanner.nextInt();
    
                        // remove from guest list and mark room as available
                        boolean foundGuest = guestList.removeGuest(guestName);
                        if (!foundGuest) {
                            throw new Exception();
                        }
                        RoomList.unoccupyRoom(roomNumber, guestName);
    
                        System.out.println(guestName + " has completed checkout for room #" + roomNumber);
                        System.out.println();
                        break;
                    } catch (Exception e) {
                        System.out.println("You have either entered invalid input or entered incorrect information");
                        System.out.println("Please use only letters for the guest name and a number between 1 and 15 for room number");
                        System.out.println("and ensure the guest/room number combination exists!");
                        System.out.println();
                        scanner.nextLine();
                        continue;
                    }
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
