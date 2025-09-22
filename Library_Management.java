package CP;
/*
Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/

class Book {
    String title;
    int publicationYear;

    // constructor banaya hai 
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // data ko display larne ke liye
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// subclass Author jo Book class ko extend kar raha hai
class Author extends Book {
    String name;
    String bio;

    // constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Book class ka constructor call kar raha hai
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Book class ka displayInfo method call kar raha hai
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class Library_Management {
    public static void main(String[] args) {
        Author A1 = new Author("The Theory of Everything", 2002, "Stephen Hawking", "A brief history of time");
        A1.displayInfo();
    }
}

