package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Наличие ошибки: " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Содержание ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 5, "Unknown symbol");
        error1.printInfo();
        Error error2 = new Error(true, 7, "Add  new symbol");
        error2.printInfo();

    }
}
