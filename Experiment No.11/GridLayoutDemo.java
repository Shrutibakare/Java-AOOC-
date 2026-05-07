import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends JFrame implements ActionListener {

    JButton buttons[] = new JButton[6];
    int index = -1;

    GridLayoutDemo() {
        setTitle("Grid Layout");
        setSize(300, 200);
        setLayout(new GridLayout(2, 3));

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton("" + (i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (index == -1) {
            for (int i = 0; i < 6; i++) {
                if (buttons[i] == clicked) {
                    index = i;
                    break;
                }
            }
        } else {
            String temp = buttons[index].getText();
            clicked.setText(temp);
            buttons[index].setText(((JButton)e.getSource()).getText());
            index = -1;
        }
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}