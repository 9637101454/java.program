import java.util.Scanner;

public class HotelBookingSystem {

    // 2D array to represent rooms (false = available, true = booked)
    private static boolean[][] rooms;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = 3;             // Number of floors
        int roomsPerFloor = 4;      // Rooms per floor
        rooms = new boolean[floors][roomsPerFloor];

        int choice;
        do {
            System.out.println("\n--- Hotel Room Booking System ---");
            System.out.println("1. View Room Status");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayRooms();
                    break;
                case 2:
                    bookRoom(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }

    // Method to display room status
    public static void displayRooms() {
        System.out.println("\nRoom Status (F = Floor, R = Room):");
        for (int floor = 0; floor < rooms.length; floor++) {
            for (int room = 0; room < rooms[floor].length; room++) {
                String status = rooms[floor][room] ? "Booked" : "Available";
                System.out.printf("F%dR%d: %s\t", floor + 1, room + 1, status);
            }
            System.out.println();
        }
    }

    // Method to book a room
    public static void bookRoom(Scanner scanner) {
        System.out.print("Enter floor number (1 to " + rooms.length + "): ");
        int floor = scanner.nextInt() - 1;

        System.out.print("Enter room number (1 to " + rooms[0].length + "): ");
        int room = scanner.nextInt() - 1;

        if (floor >= 0 && floor < rooms.length && room >= 0 && room < rooms[0].length) {
            if (!rooms[floor][room]) {
                rooms[floor][room] = true;
                System.out.println("Room F" + (floor + 1) + "R" + (room + 1) + " booked successfully.");
            } else {
                System.out.println("Room is already booked.");
            }
        } else {
            System.out.println("Invalid floor or room number.");
        }
    }
}