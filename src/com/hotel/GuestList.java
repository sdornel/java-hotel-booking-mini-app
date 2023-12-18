package com.hotel;

import com.hotel.Guest;
import java.util.ArrayList;

public class GuestList {
    private ArrayList<Guest> guests = new ArrayList<>();
    private int size;

    public void addGuest(Guest guest) {
        guests.add(guest);
        System.out.println(this);
    }

    public void removeGuest(Guest guest) {
        guests.removeIf(g -> g.getName().equals(guest.getName()));
    }

    // somehow guests array list is empty here
    public void displayGuests() {
        for (Guest guest : guests) {
            System.out.println(guest.getName());
        }
    }
}