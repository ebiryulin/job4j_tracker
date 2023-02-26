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
        for (int index = 0; index < count - 1; index++) {
            queue.poll();
        }
        return queue.poll().name();
    }

    public String getFirstUpsetCustomer() {
        for (int index = 0; index < count; index++) {
            queue.poll();
        }
        return queue.poll().name();
    }
}