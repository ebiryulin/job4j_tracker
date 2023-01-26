package ru.job4j.polymorph;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Движение по маршруту");
    }

    @Override
    public void passengers(int number) {
        number = 25;
    }

    @Override
    public int refill(int quantity, int cost) {
        quantity = 100;
        cost = 53;
        return Transport.super.refill(quantity, cost);
    }
}
