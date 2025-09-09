package CP.day7;
public class ans1 {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.display();
        Book paramBook = new Book("Ugly Love", "Colleen Hoover", 9.49);
        paramBook.display();
    } 
}
class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Verity";
        this.author = "Colleen Hoover";
        this.price = 13.50;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}
