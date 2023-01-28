package ru.job4j.oop;

public class Ttain implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам");
    }
}
