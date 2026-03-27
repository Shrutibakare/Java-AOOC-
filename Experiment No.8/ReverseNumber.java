import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumber {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField input = new JTextField(10);
        JTextField output = new JTextField(10);
        output.setEditable(false);

        JButton reverseBtn = new JButton("Reverse");

        reverseBtn.addActionListener(e -> {
            String num = input.getText();
            String reversed = new StringBuilder(num).reverse().toString();
            output.setText(reversed);
        });

        frame.add(new JLabel("Enter Number:"));
        frame.add(input);
        frame.add(reverseBtn);
        frame.add(new JLabel("Reversed:"));
        frame.add(output);

        frame.setVisible(true);
    }
}