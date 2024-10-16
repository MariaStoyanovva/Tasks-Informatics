import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please choose a category");
		    System.out.println("1. Science");
		    System.out.println("2. History");
		    System.out.println("3. Sports");

        byte category = scanner.nextByte();
        String guess;

        switch (category){
            case 1:
                System.out.println("Welcome to Science!");
                System.out.println("Who discovered gravity?");
                guess = scanner.nextLine();
                scanner.next();
                if(guess.equals("Newton")){
                    System.out.println("Correct! You earned 1 point.");
                }
                else{
                    System.out.println("Incorrect. The correct answer is Newton.");
                }
                break;

            case 2:
                System.out.println("Welcome to History!");
                System.out.println("When does WWII start?");
                guess = scanner.nextLine();
                scanner.next();
                if(guess.equals("1939")){
                    System.out.println("Correct! You earned 1 point.");
                }
                else{
                    System.out.println("Incorrect. The correct answer is 1939.");
                }
                break;

            case 3:
                System.out.println("Welcome to Sports!");
                System.out.println("Who is the best Bulgarian tennis player?");
                guess = scanner.nextLine();
                scanner.next();
                if(guess.equals("Grisho")){
                    System.out.println("Correct! You earned 1 point.");
                }
                else{
                    System.out.println("Incorrect. The correct answer is Grisho.");
                }
                break;

            default:
			System.out.println("Invalid category choice.");

        }
    }
}
