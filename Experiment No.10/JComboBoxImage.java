import javax.swing.*;
import java.awt.event.*;

public class JComboBoxImage extends JFrame implements ItemListener {

    JComboBox<String> combo;
    JLabel label;

    String flowers[] = {"Rose", "Jasmine", "Lotus", "Gerbera"};

    JComboBoxImage() {
        setTitle("Image Viewer");
        setSize(400, 400);
        setLayout(null);

        combo = new JComboBox<>(flowers);
        combo.setBounds(120, 30, 150, 30);

        label = new JLabel();
        label.setBounds(50, 100, 300, 200);

        combo.addItemListener(this);

        add(combo);
        add(label);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String selected = (String) combo.getSelectedItem();
        label.setIcon(new ImageIcon(selected + ".jpg"));
    }

    public static void main(String[] args) {
        new JComboBoxImage();
    }
}