import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MathAssessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to math quiz! Can you type your name?");
        String userName = scanner.nextLine().trim().toLowerCase();
        String fileName = userName + "-answers.txt";

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));

            for (int i = 1; i <= 5; i++) {
                int num1 = rand.nextInt(50) + 1;
                int num2 = rand.nextInt(50) + 1;
                char operator;
                int correctAnswer = 0;

                int op = rand.nextInt(3);
                if (op == 0) {
                    operator = '+';
                    correctAnswer = num1+num2;
                } else if (op == 1) {
                    operator = '-';
                    correctAnswer = num1-num2;
                } else {
                    operator = '*';
                    correctAnswer = num1*num2;
                }

                System.out.println(num1 + " " + operator + " " + num2 + " = ?");
                int userAnswer = scanner.nextInt();

                boolean isCorrect = userAnswer == correctAnswer;

                writer.println("question: " + num1 + " " + operator + " " + num2 + " = " + userAnswer + " " + (isCorrect ? "true" : "false"));
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
