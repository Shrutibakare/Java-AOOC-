import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener {

    JButton btn;

    ColorChanger() {
        setTitle("Background Color");
        setSize(400, 300);

        btn = new JButton("Choose Color");
        add(btn);

        btn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Select Color", Color.white);
        getContentPane().setBackground(c);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}