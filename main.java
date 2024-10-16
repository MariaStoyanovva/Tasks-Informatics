//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secret=5;

        System.out.println("Try to guess my secret number:");
        int try1 = scanner.nextInt();

        if(try1==secret){
            System.out.println("Congratulations! You guessed the correct number!");
            return;
        }
        else if(secret>try1){
            System.out.println("Guess higher.");
        }
        else{
            System.out.println("Guess lower.");
        }
        System.out.println("2 attempts remaining:");
        System.out.println();


        int try2 = scanner.nextInt();
        if(try2==secret){
            System.out.println("Congratulations! You guessed the correct number!");
            return;
        }
        else if(secret>try2){
            System.out.println("Guess higher:");
        }
        else{
            System.out.println("Guess lower:");
        }
        System.out.println("1 attempt remaining:");
        System.out.println();


        int try3 = scanner.nextInt();
        if(try3==secret){
            System.out.println("Congratulations! You guessed the correct number!");
            return;
        }
        else{
            System.out.println("Wrong :(  No attempts left.");
        }

    }
}
