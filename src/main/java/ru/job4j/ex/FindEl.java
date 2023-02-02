package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
            for (int index = 0; index < value.length; index++) {
                if (value[index] != key) {
                    throw new ElementNotFoundException("Element " + key + " doesn't exist in array");
                }
                if (value[index] == key) {
                    rsl = index;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", "three"};
        String key = "null";
        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
