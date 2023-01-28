package ru.job4j.oop;

public class VehicleMove {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle plane1 = new Plane();
        Vehicle train = new Ttain();
        Vehicle train1 = new Ttain();
        Vehicle bus = new Bus();
        Vehicle bus1 = new Bus();

        Vehicle[] vehicles = new Vehicle[]{plane, plane1, train, train1, bus, bus1};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
