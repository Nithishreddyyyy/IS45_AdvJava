package collections;
import java.util.*;
//class Book{
//    int id;
//    String title;
//    Book(int id, String title){
//        this.id = id;
//        this.title = title;
//    }
//    public static void main(String[] args) {
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(new Book(1,"Java"));
//
//        for(Book b : books){
//            System.out.println(b.id + "\t" + b.title);
//        }
//    }
//}

class Book{
    int id;
    String title;
    Book(int id, String title){
        this.id = id;
        this.title = title;
    }

    public static void main(String[] args) {
        Book b1 = new Book(1,"java");
        Book b2 = new Book(2,"Python");
        Book b3 = new Book(3,"C");
        ArrayList<Book> bk = new ArrayList<>(Arrays.asList(b1,b2,b3));

        for(Book b : bk ){
            System.out.println(b.id+"\t"+b.title);
        }
    }
}
