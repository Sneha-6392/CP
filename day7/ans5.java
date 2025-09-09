package CP.day7;
public class ans5 {
    public static void main(String[] args) {
         LibraryBook book = new LibraryBook("The Theory of Everything", "Stephen Hawking", 12.99, true);
        book.display();
        book.borrow();
        book.borrow(); 
        book.display();
    }
}
class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("The book " + title + " is not available.");
        }
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + available);
    }
}

