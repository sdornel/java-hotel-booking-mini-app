package com.hotel;

import com.hotel.Guest;
import java.util.ArrayList;
import java.util.Iterator;
// import java.util.List;

public class GuestList {
    private ArrayList<Guest> guests = new ArrayList<>();

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public boolean removeGuest(String guestName) {
        Iterator<Guest> iterator = this.guests.iterator();
        System.out.println("iterator " + iterator);
        boolean foundGuest = false;
        while (iterator.hasNext()) {
            Guest instance = iterator.next();
            if (instance.getName().equals(guestName)) {
                iterator.remove();
                break; // Remove only the first occurrence
            }
        }
        return foundGuest;
    }

    public void displayGuests() {
        System.out.println();
        for (Guest guest : guests) {
            System.out.println(guest.getName());
        }
        System.out.println();
    }
}