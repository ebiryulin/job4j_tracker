package ru.job4j.inherirance;

public class PizzaExtraCheese extends Pizza {
    public String name() {
        return super.name() + " + extra cheese";
    }

}
