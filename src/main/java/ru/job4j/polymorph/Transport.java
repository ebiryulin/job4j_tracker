package ru.job4j.polymorph;

public interface Transport {

    void drive();

    void passengers(int number);

    int refill(int quantity, int cost);
}
