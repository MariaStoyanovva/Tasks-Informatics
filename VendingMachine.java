import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the code for the product that you want:");
        String product = scanner.nextLine();

        switch (product){
            case "A1":
                System.out.println("Soda = $1.50");
                break;
            case "B2":
                System.out.println("Chips = $1.25");
                break;
            case "C3":
                System.out.println("Candy = $0.75");
                break;
            case "D4":
                System.out.println("Water = $1.00");
                break;
            default:
			System.out.println("Invalid input");

        }
    }
}
