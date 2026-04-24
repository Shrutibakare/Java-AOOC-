import javax.swing.*;
import java.awt.event.*;

public class TextCounter extends JFrame implements KeyListener {

    JTextArea ta;
    JLabel label;

    TextCounter() {
        setTitle("Text Counter");
        setSize(400, 300);
        setLayout(null);

        ta = new JTextArea();
        ta.setBounds(20, 20, 350, 150);

        label = new JLabel("Words: 0  Characters: 0");
        label.setBounds(20, 200, 300, 30);

        ta.addKeyListener(this);

        add(ta);
        add(label);

        setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String text = ta.getText();
        int chars = text.length();
        int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

        label.setText("Words: " + words + "  Characters: " + chars);
    }

    public void keyPressed(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new TextCounter();
    }
}