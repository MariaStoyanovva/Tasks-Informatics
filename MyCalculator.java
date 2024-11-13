import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator{
    public static void main(String[] args){

        // frame
        JFrame frame = new JFrame("My Calculator");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,1));

        // panel for textboxes
        JPanel textPanel = new JPanel(new FlowLayout());
        JTextField textbox1 = new JTextField(8);
        JTextField textbox2 = new JTextField(8);
        textPanel.add(textbox1);
        textPanel.add(textbox2);

        // panel for buttons
        JPanel buttons = new JPanel(new FlowLayout());

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");

        buttonStyle(plus);
        buttonStyle(minus);
        buttonStyle(multiply);
        buttonStyle(divide);

        buttons.add(plus);
        buttons.add(minus);
        buttons.add(multiply);
        buttons.add(divide);

        // panel for result
        JPanel result = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Result");
        result.add(label);

        frame.add(textPanel);
        frame.add(buttons);
        frame.add(result);

        frame.setVisible(true);

        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClicked('+', textbox1, textbox2, label);
            }
        });

        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClicked('-', textbox1, textbox2, label);
            }
        });

        multiply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClicked('*', textbox1, textbox2, label);
            }
        });

        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Double.parseDouble(textbox2.getText())==0) label.setText("not a number");
                else buttonClicked('/', textbox1, textbox2, label);
            }
        });
    }

    public static void buttonStyle(JButton button){
        button.setFont(new Font("Arial", Font.BOLD, 32));
        button.setForeground(Color.BLUE);
    }

    public static void buttonClicked(char operator, JTextField textbox1, JTextField textbox2, JLabel label){
        double num1 = Double.parseDouble(textbox1.getText());
        double num2 = Double.parseDouble(textbox2.getText());

        switch (operator){
            case '+':
                label.setText(String.valueOf(num1+num2));
                break;
            case '-':
                label.setText(String.valueOf(num1-num2));
                break;
            case '*':
                label.setText(String.valueOf(num1*num2));
                break;
            case '/':
                label.setText(String.valueOf(num1/num2));
                break;
        }

    }
}
