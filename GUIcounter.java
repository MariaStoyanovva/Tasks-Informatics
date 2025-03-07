import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIcounter {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My app");
        JLabel label = new JLabel("0");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("reset");

        frame.setLayout(new GridLayout(4,1));  // turns it into a table
        frame.setSize(300,300);

        frame.add(plus);
        frame.add(minus);
        frame.add(label);
        frame.add(reset);

        frame.setVisible(true);

        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int counter = Integer.parseInt(label.getText()); // string -> int
                counter++;
                label.setText(String.valueOf(counter)); // print the new value of the label
            }
        });

        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int counter = Integer.parseInt(label.getText()); // string -> int
                if(counter>0)counter--;  // it doesn't go below 0
                label.setText(String.valueOf(counter)); // print the new value of the label
            }
        });

        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int counter = 0;
                label.setText(String.valueOf(counter)); // print the new value of the label
            }
        });

    }
}
