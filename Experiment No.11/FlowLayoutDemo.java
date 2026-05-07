import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

    FlowLayoutDemo() {
        setTitle("Flow Layout");
        setSize(300, 200);

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JCheckBox("Java"));
        add(new JCheckBox("Python"));
        add(new JCheckBox("C++"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}