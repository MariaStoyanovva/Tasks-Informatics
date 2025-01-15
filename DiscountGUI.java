import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DiscountCalculator {
    private double value;
    private double discount;

    //constructor
    public DiscountCalculator(double value, double discount) {
        this.value = value;
        this.discount = discount;
    }

    //calculating discount
    public double calculateDiscountedValue() {
        return value * ((100 - discount) / 100.0);
    }

    //check if input is valid
    public boolean isValidInput() {
        return value >= 0 && discount >= 0 && discount <= 100;
    }

}

public class DiscountGUI {
    public static void main(String[] args) {
        //frame
        JFrame frame = new JFrame("Discount Calculator");
        frame.setLayout(new GridLayout(4, 1, 10, 10));
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel 1
        JPanel one = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        one.setBackground(new Color(240, 240, 255));

        JLabel valueLabel = new JLabel("Enter a value ($):");
        valueLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField valueField = new JTextField(10);

        one.add(valueLabel);
        one.add(valueField);

        //panel 2
        JPanel two = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        two.setBackground(new Color(240, 255, 240));

        JLabel discountLabel = new JLabel("Enter discount (%):");
        discountLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField discountField = new JTextField(10);

        two.add(discountLabel);
        two.add(discountField);

        //panel 3
        JPanel three = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        three.setBackground(new Color(255, 240, 240));

        JButton enter = new JButton("Calculate");
        enter.setFont(new Font("Arial", Font.BOLD, 18));
        enter.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        three.add(enter);

        //panel 4
        JPanel four = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        four.setBackground(new Color(255, 250, 240));

        JLabel resultLabel = new JLabel("Final price will appear here");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        resultLabel.setForeground(new Color(128, 0, 0)); //dark red

        four.add(resultLabel);

        //adding panels to frame
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);

        //what enter button does button
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    String valueText = valueField.getText();
                    String discountText = discountField.getText();

                if (valueField.getText().isEmpty() || discountField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields!", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                    double value = Double.parseDouble(valueText);
                    double discount = Double.parseDouble(discountText);

                    DiscountCalculator calculator = new DiscountCalculator(value, discount);

                    if (!calculator.isValidInput()) {
                        JOptionPane.showMessageDialog(frame, "Invalid input! Ensure values are positive and discount is <= 100.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    double result = calculator.calculateDiscountedValue();
                    resultLabel.setText(String.format("Final Price: $%.2f", result));

            }
        });

        //make frame visible
        frame.setVisible(true);
    }
}
