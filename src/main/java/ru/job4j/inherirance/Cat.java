package ru.job4j.inherirance;

public class Cat extends  Animal {
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Cat");
    }

    public static void staticInvoke() {
        System.out.println("Вызов статического метода Cat");
    }
}
