import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationarySystem extends JFrame implements ActionListener {

    JCheckBox cb1, cb2, cb3;
    JButton order;

    StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(350, 250);
        setLayout(new FlowLayout());

        cb1 = new JCheckBox("Notebook @ 50");
        cb2 = new JCheckBox("Pen @ 30");
        cb3 = new JCheckBox("Pencil @ 10");

        order = new JButton("Order");

        add(cb1);
        add(cb2);
        add(cb3);
        add(order);

        order.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String msg = "";

        if(cb1.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Notebook Quantity:");
            int q = Integer.parseInt(qty);
            total += q * 50;
            msg += "Notebook Qty: " + q + "\n";
        }

        if(cb2.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Pen Quantity:");
            int q = Integer.parseInt(qty);
            total += q * 30;
            msg += "Pen Qty: " + q + "\n";
        }

        if(cb3.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Pencil Quantity:");
            int q = Integer.parseInt(qty);
            total += q * 10;
            msg += "Pencil Qty: " + q + "\n";
        }

        msg += "\nTotal = " + total;

        JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Successfully Ordered!", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new StationarySystem();
    }
}