package Lab._4;

import java.util.*;

class Book {
    public int id;
    public String title, author, publisher;
    public double price;

    // Constructor
    Book(int id, String title, String author, String publisher, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // Overriding toString() method
    public String toString() {
        return "ID: " + id + "\tTitle: " + title + "\nAuthor: " + author + "\tPrice: Rs. " + price
                + "\nPublisher: " + publisher;
    }
}

class Test {
    public static void main(String[] args) {
        // Creating an array of Book objects
        Book[] books = new Book[5];
        books[0] = new Book(10, "Java", "Hars", "PHI", 142);
        books[1] = new Book(20, "Java", "Ana", "PUB", 752);
        books[2] = new Book(30, "Python", "New", "Nwe", 153);
        books[3] = new Book(40, "Pointers", "Rahul", "Penguin", 645);
        books[4] = new Book(50, "Let's Learn C", "Rahul", "Ramaiah", 158);

        // Display all books
        System.out.println("List of Books:");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("------------");
        }

        System.out.println("\nBooks with Price Less Than Rs. 500:");
        for (Book book : books) {
            if (book.price < 500) {
                System.out.println(book);
                System.out.println("------------");
            }
        }

        System.out.println("\nBooks by the Same Author:");
        for (int i = 0; i < books.length; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].author.equals(books[j].author)) {
                    System.out.println(books[i]);
                    System.out.println(books[j]);
                    System.out.println("------------");
                }
            }
        }

        // Display books with titles containing the substring "C"
        System.out.println("\nBooks with Titles Containing 'C':");
        for (Book book : books) {
            if (book.title.contains("C")) {
                System.out.println(book);
                System.out.println("------------");
            }
        }

        // Display unique publishers
        System.out.println("\nUnique Publishers:");
        Set<String> publishersSet = new HashSet<>();
        for (Book book : books) {
            publishersSet.add(book.publisher);
        }
        for (String publisher : publishersSet) {
            System.out.println(publisher);
        }
    }
}
