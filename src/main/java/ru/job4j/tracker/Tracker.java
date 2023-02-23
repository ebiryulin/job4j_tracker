package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    private int indexOfId(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> localList = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                localList.add(item);
            }
        }
        return localList;
    }

    public Item findById(int id) {
        int index = indexOfId(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOfId(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.remove(index);
            items.add(item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOfId(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}