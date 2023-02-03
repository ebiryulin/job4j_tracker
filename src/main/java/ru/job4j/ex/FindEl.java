package ru.job4j.ex;

import java.util.Arrays;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            boolean found = Arrays.asList(value).contains(key);
            if (!found) {
                throw new ElementNotFoundException("Element " + key + " doesn't exist in array");
            }
            if (value[index].equals(key)) {
                rsl = index;
                }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", "three"};
        String key = "threee";
        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
