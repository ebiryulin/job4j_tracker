package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return items;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                rsl[index] = item;
                size++;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}