package com.hotel;

import com.hotel.Guest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GuestList {
    private ArrayList<Guest> guests = new ArrayList<>();
    private int size;

    public void addGuest(Guest guest) {
        this.guests.add(guest);
        System.out.println(this);
    }

    public void removeGuest(String guestName) {
        Iterator<Guest> iterator = this.guests.iterator();
        while (iterator.hasNext()) {
            Guest instance = iterator.next();
            if (instance.getName().equals(guestName)) {
                iterator.remove();
                break; // Remove only the first occurrence
            }
        }
    }

    // somehow guests array list is empty here
    public void displayGuests() {
        for (Guest guest : guests) {
            System.out.println(guest.getName());
        }
    }
}