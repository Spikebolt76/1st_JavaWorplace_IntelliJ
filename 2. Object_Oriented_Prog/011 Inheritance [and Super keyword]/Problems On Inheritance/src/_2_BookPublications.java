//[2] Hierarchical Inheritance - Book Publications
//  Create a base class Publication with attributes: title and price.
//  Derive two subclasses: Book and Journal.
//  Each subclass should have a unique attribute (author_name for Book and editor_name for Journal).
//  Implement a method to display details of both book and journal objects. Demonstrate hierarchical inheritance.

// Hierarchical inheritance in Java is a type of inheritance where a single parent class is extended by multiple child classes.

class Publication {

    String title;
    double price;

    public Publication(String title, double price){
        this.title = title;
        this.price = price;
    }
}

class Book extends Publication {

    String author_name;

    public Book(String title, double price, String author_name){
        super(title, price);

        this.author_name = author_name;
    }

    void displayDetails() {
        System.out.println("Book details =>");
        System.out.println("Title : "+ title);
        System.out.println("Price : "+ price);
        System.out.println("Author : "+ author_name);
        System.out.println();
    }
}

class Journal extends Publication {
    String editor_name;

    public Journal(String title, double price, String editor_name){
        super(title, price);

        this.editor_name = editor_name;
    }

    void displayDetails() {
        System.out.println("Journal details =>");
        System.out.println("Title : "+ title);
        System.out.println("Price : "+ price);
        System.out.println("Editor : "+ editor_name);
        System.out.println();
    }

}
public class _2_BookPublications {

    public static void main(String[] args) {

        Book book = new Book("Introduction to JAVA", 34.99, "Daniel T. Liang");
        book.displayDetails();

        Journal journal = new Journal("Nature", 12.99, "UNKNOWN");
        journal.displayDetails();


    }
}
