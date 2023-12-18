package com.hotel;

import com.hotel.Guest;
import java.util.ArrayList;

public class GuestList {
    private ArrayList<Guest> guests = new ArrayList<>();
    private int size;

    public void addGuest(Guest guest) {
        System.out.println("Guest " + guest);
        guests.add(guest);
        System.out.println("top Guests " + guests.get(0).getName());
    }

    public void removeGuest(Guest guest) {
        guests.removeIf(g -> g.getName().equals(guest.getName()));
    }

    public void displayGuests() {
        System.out.println("Guests " + guests);
        for (Guest guest : guests) {
            System.out.println(guest);
        }
    }
}