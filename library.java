public class library {
    public static void main(String[] args) {
        // Task 4: Create two or more Book objects with different attributes.
        Book b1 = new Book("Fahrenheit 451", "Ray Bradbury", "324");
        Book b2 = new Book("Pod Igoto", "Ivan Vazov", "231");
        Book b3 = new Book("Bai Ganyo", "Aleko Konstantinov", "120");

        // Task 5: Call the displayDetails method for each object.
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}

// Define the Book class
class Book {
    // Task 1: Add three attributes: title, author, and numberOfPages.
    private String title;
    private String author;
    private String numberOfPages;

    // Constructor
    public Book(String title, String author, String numberOfPages) {
        // Task 2: Initialize the attributes inside this constructor.
        this.title=title;
        this.author=author;
        this.numberOfPages = numberOfPages;
    }

    // Task 3: Add a method displayDetails() to print the book's details (title, author, and numberOfPages).
    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println();

    }
}
