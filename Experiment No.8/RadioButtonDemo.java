import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton submit = new JButton("Submit");

        submit.addActionListener(e -> {
            if (male.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Male Selected");
            } else if (female.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Female Selected");
            } else {
                JOptionPane.showMessageDialog(frame, "Please select gender");
            }
        });

        frame.add(male);
        frame.add(female);
        frame.add(submit);

        frame.setVisible(true);
    }
}