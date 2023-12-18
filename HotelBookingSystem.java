import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Hotel Booking System Menu");
            System.out.println("1: Check-in");
            System.out.println("2: Check-out");
            System.out.println("3: View available rooms");
            System.out.println("4: View guest list");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    System.out.println("Enter room number: ");
                    int roomNumber = scanner.nextInt();

                    // add from guest list and mark room as occupied

                    System.out.println(guestName + " has completed checkin for room #" + roomNumber);
                    break;
                }
                case 2 -> {
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();

                    System.out.println("Enter room number: ");
                    int roomNumber = scanner.nextInt();

                    // remove from guest list and mark room as available

                    System.out.println(guestName + " has completed checkout for room #" + roomNumber);
                    break;
                }
                case 3 -> {
                    // loop through array with room number and room type
                    break;
                }
                case 4 -> {
                    // loop through array printing new lines for each guest/room number/room type
                    break;
                }
                case 5 -> {
                    System.out.println("Exiting Hotel Booking System. Goodbye!");
                    exit = true;
                    break;
                }
            }
        }
        scanner.close();
    }
}