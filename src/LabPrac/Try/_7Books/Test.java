package LabPrac.Try._7Books;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Book> books = new ArrayList<> ();
        books.add(new Book(10,"Java","Nithish","PHI",1232));
        books.add(new Book(11,"Python","Ananya","Me",2311));
        books.add(new Book(12,"C","Anu","Om",213));

        System.out.println("List of all Books: ");
        for (Book bk : books) {
            System.out.println(bk);
            System.out.println("------");
        }
        System.out.println("\n\n\n\n");
        List <Book> sortedByPrice = new ArrayList<>(books);
        sortedByPrice.sort(Comparator.comparingDouble(b->b.price));
        for (Book bk : sortedByPrice) {
            System.out.println(bk);
            System.out.println("------");
        }

        System.out.println("\n\n\n\n");

        System.out.println("Enter an author's name: ");
        String authorName = sc.nextLine();
        for (Book bk : books) {
            if(bk.author.equalsIgnoreCase(authorName)){
                System.out.println(bk);
            }
        }
    }
}
