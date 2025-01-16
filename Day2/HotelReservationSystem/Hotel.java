import java.util.*;

public class Hotel {
    private List<Room> rooms;
    public Hotel() {
        rooms = new ArrayList<>();
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void displayAllRooms() {
        System.out.println("Room Details:");
        for (Room room : rooms) {
            room.displayRoomDetails();
        }
        System.out.println();
    }
    public Room checkAvailability(String roomType) {
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType) && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }
    public void bookRoom(String roomType, int nights) {
        Room availableRoom = checkAvailability(roomType);
        if (availableRoom != null) {
            availableRoom.setAvailable(false);
            double totalCharge = calculateTotalCharges(availableRoom, nights);
            System.out.println("Room " + availableRoom.getRoomNumber() + " (" + roomType + ") has been booked.");
            System.out.println("Total Charge for " + nights + " night(s): $" + totalCharge);
        } else {
            System.out.println("No " + roomType + " rooms are available.");
        }
    }
    private double calculateTotalCharges(Room room, int nights) {
        return room.getPricePerNight() * nights;
    }
}













