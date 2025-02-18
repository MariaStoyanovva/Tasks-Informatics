import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Oreo", "Soleti", "Water", "Crackers", "Gum"};
        double[] price = {2.3, 1.5, 0.9, 3.2, 2.0};
        int[] quantity = {6, 6, 6, 6, 6};

        System.out.println("Choose a product by entering it's number");
        System.out.println("If you want to exit, enter 10");
        System.out.println();
        int purchasedProduct;
        do {
            displayInformation(names,price,quantity);
            purchasedProduct = scanner.nextInt();
            if(purchasedProduct!=10){
                purchase(names, price, quantity, purchasedProduct);
            }
        }while(purchasedProduct<=names.length);
    }

    public static void displayInformation(String[] names, double[] price,  int[] quantity) {
        System.out.println("Number-Product-Price-Quantity");
        for(int i=0;i<names.length;i++){
            System.out.println(i+1 + " - " + names[i] + " - " + price[i] + " - " + quantity[i]);
        }
    }

    public static void purchase(String[] names, double[] price,  int[] quantity, int pp){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product you want to purhase: " + names[pp-1]);
        System.out.println("Money it costs: $" + price[pp-1]);
        System.out.print("Insert money: $");
        double enteredMoney = scanner.nextDouble();
        if(enteredMoney<price[pp-1]){
            System.out.printf("Not enough money! You need to insert additional $" + "%.2f",(price[pp-1]-enteredMoney));
            System.out.println();
            System.out.println();
        }
        else{
            double change = (enteredMoney - price[pp-1]);
            System.out.printf("Change: $" + "%.2f", change);
            quantity[pp-1]--;
            System.out.println();
            System.out.println();
        }

    }
}
