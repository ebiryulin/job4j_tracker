package ru.job4j.enumeration;

public class CarService {

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Status Toyota: " + toyota);
        System.out.println("Status Volvo: " + volvo);
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Order #" + order.getNumber() + " on car " + order.getCar()
                + ", Service status: " + order.getStatus());
    }
}
