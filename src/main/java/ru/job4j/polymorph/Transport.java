package ru.job4j.polymorph;

public interface Transport {

    void drive();

    void passengers(int number);

    default int refill(int quantity, int cost) {
        return cost * quantity;
    }
}
