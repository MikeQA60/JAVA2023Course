package Week12OOPInheritanceInJava.Class12point13ObejectsAsInstanceVariablesInJava;

//import java.util.ArrayList;
//import java.util.List;
//
//public class Housept1 {
//    public static void main(String[] args) {
//
//    }
//}
//
//class House {
//    private String address; // The address of the house
//    private List<Room> rooms; // A list to store the rooms in the house
//    private static int totalHouses; // A static variable to keep track of the total number of houses
//
//    public House(String address) {
//        // Constructor for the House class
//        this.address = address; // Initialize the address
//        this.rooms = new ArrayList<>(); // Initialize the rooms list
//        totalHouses++; // Increment the total number of houses
//    }
//
//    public void addRoom(Room room) {
//        // Method to add a room to the house
//        rooms.add(room);
//    }
//
//    public Room getRoom(int roomNumber) {
//        // Method to get a room by its room number
//        for (Room room : rooms) {
//            if (room.getRoomNumber() == roomNumber) {
//                return room;
//            }
//        }
//        return null;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public List<Room> getRooms() {
//        return rooms;
//    }
//
//    public void setRooms(List<Room> rooms) {
//        this.rooms = rooms;
//    }
//
//    public static int getTotalHouses() {
//        return totalHouses;
//    }
//}
//
//class Room {
//    private int roomNumber;
//    private Door door;
//    private Window window;
//
//    public Room(int roomNumber, Door door, Window window) {
//        // Constructor for the Room class
//        if (roomNumber <= 0) {
//            System.out.println("Room number must be a positive integer.");
//        } else {
//            this.roomNumber = roomNumber;
//        }
//        this.door = door;
//        this.window = window;
//    }
//
//    // Methods to set and get room attributes
//}
//
//class Door {
//    private String material;
//    private String color;
//
//    public Door(String material, String color) {
//        // Constructor for the Door class
//        this.material = material;
//        this.color = color;
//    }
//
//    // Methods to set and get door attributes
//}
//
//class Window {
//    private String size;
//    private String type;
//
//    public Window(String size, String type) {
//        // Constructor for the Window class
//        this.size = size;
//        this.type = type;
//    }
//
//    // Methods to set and get window attributes
//}
