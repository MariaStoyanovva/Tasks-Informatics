import java.util.Scanner;
public class Library {
   public static void main(String[] args) {


       Book[] bookArray = {
               new Book("Animal Farm", "George Orwell", 1945, null),
               new Book("Beloved", "Toni Morrison", 1987, null),
               new Book("Mockingjay", "Suzanne Collins", 2010, null),
               new Book("Dune", "Frank Herbert", 1965, null),
               new Book("Moby-Dick", "Herman Melville", 1851, null),
               new Book("Wuthering Heights", "Emily Bronte", 1847, null),


       };


       Scanner scanner = new Scanner(System.in);
       int code;


       do{
           System.out.println();
           System.out.println("===== Library Management System =====");
           System.out.println("1. Display Library");
           System.out.println("2. Borrow a Book");
           System.out.println("3. Return a Book");
           System.out.println("4. Exit");


           code = scanner.nextInt();


           switch (code){
               case 1:
                   displayLibrary(bookArray);
                   break;
               case 2:
                   borrowBook(bookArray, scanner);
                   break;
               case 3:
                   returnBook(bookArray, scanner);
                   break;
               case 4:
                   System.out.println("Exiting Library.");
                   break;
       }
       }while(code<4);


   }


   private static int findBookTitle(Book[] books, String title) {
       title=title.replaceAll("\\s", "");
       int index=0;
       for(int i=0;i<books.length;i++){
           String current = books[i].getTitle();
           current=current.replaceAll("\\s", "");
           if((current.toLowerCase()).contains(title.toLowerCase())){
               index=i;
           }
       }
       return index;
   }


   private static void returnBook(Book[] books, Scanner scanner){
       scanner=new Scanner(System.in);
       System.out.println("Which book do you want to return? Enter it's name");
       String entered = scanner.nextLine();
       int indexOfBook = findBookTitle(books, entered);
       if(books[indexOfBook].borrowerName==null){
           System.out.println("This book is not borrowed by anyone!");
       }
       else{
           books[indexOfBook].returnBook();
           System.out.println("You successfully returned " + books[indexOfBook].getTitle() + ".");

       }
   }


   private static void borrowBook(Book[] books, Scanner scanner){
       scanner= new Scanner(System.in);
       System.out.println("What's your name?");
       String nameOfBorrower = scanner.nextLine();

       System.out.println("Which book do you want to borrow? Enter it's name.");
       String entered = scanner.nextLine();
       int indexOfBook=findBookTitle(books, entered);
       if(books[indexOfBook].borrowerName!=null) System.out.print("This book is not available.");
       else{
           books[indexOfBook].borrowBook(nameOfBorrower);
           System.out.println(nameOfBorrower + " successfully borrowed " + books[indexOfBook].getTitle() + ".");
       }
   }


   private static void displayLibrary(Book[] books){
       System.out.println("All books:");
       for(Book elements: books){
           elements.getDetails();
       }
   }


}


class Book {
   String title;
   String author;
   int yearPublished;
   String borrowerName;


   public Book(String title, String author, int yearPublished, String borrowerName) {
       this.title = title;
       this.author = author;
       this.yearPublished = yearPublished;
       this.borrowerName=null;
   }


   public void borrowBook(String borrowerName) {
       this.borrowerName=borrowerName;
   }


   public String getBorrowerName(){
       return borrowerName;
   }


   public String getTitle() {
       return title;
   }


   public void getDetails() {
       if(borrowerName!=null){
           System.out.println(title + " - " + author + " - " + yearPublished + " | BORROWED BY: " + borrowerName);
       }else{
           System.out.println (title + " - " + author + " - " + yearPublished + " | AVAILABLE");
       }
   }


   public void updateBookInfo(String newTitle, String newAuthor, int newYearPublished) {
       title=newTitle;
       author=newAuthor;
       yearPublished=newYearPublished;
   }


   public void returnBook(){
       borrowerName=null;
   }




}
