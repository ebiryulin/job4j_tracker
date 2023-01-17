package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Book0", 10);
        Book book1 = new Book("Book1", 20);
        Book book2 = new Book("Book2", 30);
        Book book3 = new Book("Clean code", 40);
        Book[] library = new Book[4];
        library[0] = book0;
        library[1] = book1;
        library[2] = book2;
        library[3] = book3;
        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Change 0 and 3 index");
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Show books with name - \"Clean code\"");
        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            if (book.getName() == "Clean code") {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}