package hotelbookingminiapp;

public class Room {
    private int number;
    private RoomType type;
    
    public enum RoomType {
        ONEBED, TWOBED, SUITE
    }

    public Room(int number, String email) {
        this.number = number;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    // // Setters
    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }
}