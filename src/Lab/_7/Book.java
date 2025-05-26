package Lab._7;

public class Book
{
    int id;
    String title,author,publisher;
    double price;


    public Book(int id, String title, String auhtor, String publisher, double price)
    {
        this.id = id;
        this.title = title;
        this.author = auhtor;
        this.publisher = publisher;
        this.price = price;
    }


    @Override
    public String toString()
    {
        return "Book: " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price;
    }


}
