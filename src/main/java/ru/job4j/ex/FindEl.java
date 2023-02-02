package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
            for (String val : value) {
                if (val != key) {
                    throw new ElementNotFoundException("Element " + key + " doesn't exist in array");
                }
                if (val == key) {
                    rsl = ?;
                }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", "three"};
        String key = "two";
        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
