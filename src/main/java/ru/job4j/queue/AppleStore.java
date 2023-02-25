package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String rsl = null;
        for (Customer customer : queue) {
            queue.poll();
            if (queue.size() == count) {
                rsl = queue.poll().name();
                break;
            }
        }
        return rsl;
    }

    public String getFirstUpsetCustomer() {
        String rsl = null;
        for (Customer customer : queue) {
            queue.poll();
            if (queue.size() < count) {
                rsl = queue.poll().name();
                break;
            }
        }
        return rsl;
    }
}