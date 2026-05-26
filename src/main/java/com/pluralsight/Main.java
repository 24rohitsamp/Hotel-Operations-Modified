package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(2, 200.00);

        room.checkIn();
        System.out.println("Room is occupied: " + room.isOccupied());
        System.out.println("Room is dirty: " + room.isDirty());