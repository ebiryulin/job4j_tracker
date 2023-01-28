package ru.job4j.polymorph;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Движение по маршруту");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number);
    }

    @Override
    public int refill(int quantity, int cost) {
        quantity = 100;
        cost = 53;
        return quantity * cost;
    }
}
