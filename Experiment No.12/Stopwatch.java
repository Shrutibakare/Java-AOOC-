import javax.swing.*;
import java.awt.event.*;

public class Stopwatch extends JFrame implements Runnable, ActionListener {

    JLabel l;
    JButton start, stop;

    int sec = 0;
    boolean running = false;

    Thread t;

    Stopwatch() {

        l = new JLabel("0", JLabel.CENTER);

        start = new JButton("Start");
        stop = new JButton("Stop");

        add(l, "North");
        add(start, "West");
        add(stop, "East");

        start.addActionListener(this);
        stop.addActionListener(this);

        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {

        while (running) {

            sec++;

            l.setText("Seconds : " + sec);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start) {

            running = true;

            t = new Thread(this);
            t.start();
        }

        if (e.getSource() == stop) {

            running = false;
        }
    }

    public static void main(String args[]) {

        new Stopwatch();
    }
}