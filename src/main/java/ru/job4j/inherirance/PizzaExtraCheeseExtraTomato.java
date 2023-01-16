package ru.job4j.inherirance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese{
    public String name() {
        return super.name() + " + extra tomato";
    }
}
