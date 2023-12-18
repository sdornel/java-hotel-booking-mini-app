package hotelbookingminiapp;

import hotelbookingminiapp.Guest;
import java.util.ArrayList;

public class GuestList {
    private ArrayList<Guest> guests = new ArrayList<>();
    private int size;

    public void addGuest(Guest guest) {
        guests.add(guest);
    }
}