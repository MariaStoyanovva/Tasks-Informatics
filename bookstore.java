import java.util.Scanner;

public class bookstore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] titles = {"Harry Potter and the Sorcerer's Stone", "Pipi Longstocking", "Harry Potter and the Chamber of Secrets", "We Were Liars", "A Family of Liars"};
        double[] price = {19.9, 21.2, 23, 22, 19};
        int[] quantity = {10, 10, 10, 10, 10};

        System.out.println("Choose a book by entering it's number.");
        System.out.println("If you want to search for a book, write 'search'.");
        System.out.println("If you want to exit, enter 'exit'.");
        System.out.println();
        System.out.print("Enter your current balance: ");
        System.out.println();

        double userMoney = scanner.nextDouble();
        scanner.nextLine();

        String purchasedBook;
        do{
            displayInformation(titles,price,quantity);
            String purchasedProduct = scanner.nextLine();
            purchasedBook=purchasedProduct;
            if(isNumeric(purchasedBook)){
                if(Integer.parseInt(purchasedBook)<=(titles.length) )purchase(titles, price, quantity, purchasedBook, userMoney);
                else{
                    System.out.println("Invalid input. Enter a code (1-5), 'search', or 'exit'");
                    System.out.println();
                }
            }
            else {
                if(purchasedProduct.equalsIgnoreCase("Search")){
                    System.out.println("Search bar opened:");
                    String bookSearched = scanner.nextLine();
                    search(titles, bookSearched);
                }
                else if(purchasedProduct.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for visiting the online bookstore. Your balance: $" + userMoney);
                }
                else{
                    System.out.println("Invalid input. Enter a code (1-5), 'search', or 'exit'");
                    System.out.println();
                }
            }

        }while(!purchasedBook.equalsIgnoreCase("exit"));
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static void displayInformation(String[] titles, double[] price,  int[] quantity) {
        System.out.println("Code-Title-Price-Quantity");
        for(int i=0;i<titles.length;i++){
            System.out.println(i+1 + " - " + titles[i] + " - " + price[i] + " - " + quantity[i]);
        }
    }

    public static void search(String[] titles, String bookToLookUp){
        int num=0;
        for(String book: titles){
            String tempTitle= bookToLookUp.toLowerCase();
            if(book.toLowerCase().contains(tempTitle)){
                if(num==0) System.out.println("Books that match your search:");
                System.out.println(book);
                num++;
            }
        }
        if(num==0) System.out.println("No books match your search");
        System.out.println();
    }

    public static void purchase(String[] titles, double[] price,  int[] quantity, String pp, double userMoney){
        Scanner scanner = new Scanner(System.in);
        int p = Integer.parseInt(pp);
        System.out.println("Product you want to purchase: " + titles[p-1]);
        System.out.println("Money it costs: $" + price[p-1]);
        System.out.print("Insert money: $");
        double enteredMoney = scanner.nextDouble();
        if(enteredMoney>userMoney){
            System.out.println("You are trying to enter more money than you have in your balance.");
        }
        else if(userMoney<price[p-1]) {
            System.out.println("You don't have enough money.");
        }
        else if(enteredMoney<price[p-1]){
            System.out.printf("Not enough money! You need to insert additional $" + "%.2f",(price[p-1]-enteredMoney));
            System.out.println();
        }
        else{
            double change = (enteredMoney - price[p-1]);
            userMoney-=price[p-1];
            System.out.printf("Change: $" + "%.2f", change);
            System.out.println();
            System.out.printf("Balance: $" + "%.2f", userMoney);
            System.out.println();
            quantity[p-1]--;
        }
        System.out.println();
    }
}
