import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.addRoom(new Room(101, "Single", true, 50.0));
        hotel.addRoom(new Room(102, "Double", true, 75.0));
        hotel.addRoom(new Room(103, "Suite", true, 150.0));
        hotel.addRoom(new Room(104, "Double", true, 75.0));
        hotel.addRoom(new Room(105, "Suite", false, 150.0));

        hotel.displayAllRooms();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter room type to book (Single, Double, Suite) or type 'exit' to quit: ");
            String roomType = scanner.nextLine();

            if (roomType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the number of nights: ");
            int nights = scanner.nextInt();
            scanner.nextLine(); 

            hotel.bookRoom(roomType, nights);
            System.out.println();
            hotel.displayAllRooms();
        }

        System.out.println("Thank you for using the Hotel Reservation System!");
    }
}












