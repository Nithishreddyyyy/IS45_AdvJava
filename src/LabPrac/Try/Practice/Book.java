package LabPrac.Try.Practice;

import java.util.*;

public class Book {
    String title,author,publisher;
    double price;

    public Book(String title, String author, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}

class TestBook{
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        bookList.add(new Book("Java","John","Doe",123));
        bookList.add(new Book("Python","Anushree","Doe",110));
        bookList.add(new Book("C","Nithish","Doe",90));
        bookList.add(new Book("Cpp","Meow","Doe",32));

        //Disp of all books
        System.out.println("All the books are:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        System.out.println("-----");

        //Ascending
        System.out.println("Books in ascending order:");
        List<Book> sortedBooks = new ArrayList<>(bookList);
        sortedBooks.sort(Comparator.comparingDouble(b->b.price));
        Iterator<Book> it = sortedBooks.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------");
        System.out.println("Enter an author'sname to search");
        String author = sc.nextLine();
        for (Book bk : bookList){
            if(bk.author.equalsIgnoreCase(author)){
                System.out.println(bk);
            }
        }

        System.out.println("-----------");


    }
}
