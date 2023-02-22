package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    //private int indexOfId(int id) {
        //int rsl = -1;
        //for (Item item : items) {
            //if (item.getId() == id) {
                //rsl = item.getId();
                //break;
            //}
        //}
        //return rsl;
    //}

    private int indexOfId(int id) {
        int rsl = -1;
        for (Item item : items) {
            //if (items.indexOf(item) == id) {
            if (item.getId() == id) {
                rsl = item.getId();
                break;
            }
        }
        return rsl;
    }

    //private int indexOfId(int id) {
        //int rsl = -1;
        //for (int index = 0; index < size; index++) {
            //if (items[index].getId() == id) {
            //rsl = index;
            //break;
        //}
    //}
    //return rsl;
//}

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    //public List<Item> add(List<Item> item) {
        //item.set(ids++, (Item) item);
        //return item;
    //}

    //public Item add(Item item) {
        //item.setId(ids++);
        //items[size++] = item;
        //return item;
    //}

    public List<Item> findAll() {
        return items;
    }

    //public Item[] findAll() {
        //return Arrays.copyOf(items, size);
    //}

    public List<Item> findByName(String key) {
        for (int index = 0; index < size; index++) {
            Item item = items.get(index);
            if (key.equals(item.getName())) {
                item.setId(index);
            }
        }
        return items;
    }

    //public Item[] findByName(String key) {
        //int counter = 0;
        //Item[] rsl = new Item[size];
        //for (int index = 0; index < size; index++) {
            //Item item = items[index];
            //if (key.equals(item.getName())) {
                //rsl[counter] = item;
                //counter++;
            //}
        //}
        //return Arrays.copyOf(rsl, counter);
    //}

    public Item findById(int id) {
        int index = indexOfId(id);
        return index != -1 ? items.get(index) : null;
    }

    //public Item findById(int id) {
        //int index = indexOfId(id);
        //return index != -1 ? items[index] : null;
    //}

    public boolean replace(int id, Item item) {
        int index = indexOfId(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
        }
        return rsl;
    }

    //public boolean replace(int id, Item item) {
        //int index = indexOfId(id);
        //boolean rsl = index != -1;
        //if (rsl) {
            //item.setId(id);
            //items[index] = item;
        //}
        //return rsl;
    //}

    public boolean delete(int id) {
        int index = indexOfId(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(id);
        }
        return rsl;
    }

    //public boolean delete(int id) {
        //int index = indexOfId(id);
        //boolean rsl = index != -1;
        //if (rsl) {
            //System.arraycopy(items, index + 1, items, index, size - index - 1);
            //items[size - 1] = null;
            //size--;
        //}
        //return rsl;
    //}
}