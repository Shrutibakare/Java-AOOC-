import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame implements ActionListener {

    JLabel label;
    JButton start, stop;
    Timer timer;
    int count = 0;

    SimpleTimer() {
        setTitle("Timer");
        setSize(300, 200);
        setLayout(null);

        label = new JLabel("0");
        label.setBounds(130, 30, 50, 30);

        start = new JButton("Start");
        stop = new JButton("Stop");

        start.setBounds(50, 80, 80, 30);
        stop.setBounds(150, 80, 80, 30);

        add(label);
        add(start);
        add(stop);

        start.addActionListener(this);
        stop.addActionListener(this);

        timer = new Timer(1000, e -> {
            count++;
            label.setText("" + count);
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start)
            timer.start();
        else
            timer.stop();
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}