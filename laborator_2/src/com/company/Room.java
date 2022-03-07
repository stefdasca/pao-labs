package com.company;

public class Room {
    private int roomNumber;
    private String roomType;
    private int roomFloor;

    public Room(int roomNumber, String roomType, int roomFloor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public void printRoom() {
        System.out.println("Room Number: " + this.roomNumber);
        System.out.println("Room Type: " + this.roomType);
        System.out.println("Room Floor: " + this.roomFloor);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Room r1 = new Room(413, "Maths", 1);
        Room r2 = new Room(402, "Biology", 3);
        r1.printRoom();
        r2.printRoom();
    }

}