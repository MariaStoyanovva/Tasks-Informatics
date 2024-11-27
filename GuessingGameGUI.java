import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGameGUI{
    public static void main(String[] args) {

        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        // frame
        JFrame frame = new JFrame("Guessing Game");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(6, 1));

        // panel 1
        JPanel one = new JPanel(new FlowLayout());
        JLabel welcome1 = new JLabel("Welcome to the Guessing Game!");
        one.add(welcome1);

        // panel 1.1
        JPanel oneOne = new JPanel(new FlowLayout());
        JLabel welcome2 = new JLabel("Try to guess my integer number between 1 & 100!");
        oneOne.add(welcome2);

        // panel 1.2
        JPanel oneTwo = new JPanel(new FlowLayout());
        JLabel welcome3 = new JLabel("You can quit at any time.");
        oneTwo.add(welcome3);

        // panel 2
        JPanel two = new JPanel(new FlowLayout());
        JTextField guess = new JTextField(8);

        JButton enter = new JButton("Enter");
        enter.setFont(new Font("Arial", Font.BOLD, 32));
        enter.setForeground(Color.BLUE);

        two.add(guess);
        two.add(enter);


        // panel 3
        JPanel three = new JPanel(new FlowLayout());
        JLabel result = new JLabel("");

        three.add(result);

        //panel 4
        JPanel four = new JPanel(new FlowLayout());
        JButton quit = new JButton("QUIT");

        quit.setFont(new Font("Arial", Font.BOLD, 32));
        quit.setForeground(Color.RED);

        four.add(quit);

        // add to frame
        frame.add(one);
        frame.add(oneOne);
        frame.add(oneTwo);
        frame.add(two);
        frame.add(three);
        frame.add(four);

        frame.setVisible(true);

        // what the ENTER button does
        enter.addActionListener(new ActionListener() {
            int attempts = 0;

            public void actionPerformed(ActionEvent e) {
                attempts++;
                try {
                    if(Integer.parseInt(guess.getText())>0 && Integer.parseInt(guess.getText())<=100) {
                        if (Integer.parseInt(guess.getText()) < secret) result.setText("Guess higher!");
                        else if (Integer.parseInt(guess.getText()) > secret) result.setText("Guess lower!");
                        else result.setText("CONGRATULATIONS! The number is " + secret + ". You guessed it in " + attempts + " attempts");
                    }
                    else result.setText("ERROR! Invalid input");

                } catch (NumberFormatException f) {
                    result.setText("ERROR! Invalid input");
                }
            }
        });

        // what the QUIT button does
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }}

