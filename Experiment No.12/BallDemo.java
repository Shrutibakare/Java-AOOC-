import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallPanel extends JPanel implements Runnable, MouseListener {

    int x = 50, y = 50;
    int dx = 2, dy = 2;

    Thread t;

    BallPanel() {
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30);
    }

    public void run() {

        while (true) {

            x = x + dx;
            y = y + dy;

            // Bounce from walls
            if (x <= 0 || x >= getWidth() - 30)
                dx = -dx;

            if (y <= 0 || y >= getHeight() - 30)
                dy = -dy;

            repaint();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }

    public void mousePressed(MouseEvent e) {

        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    // Unused methods
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}

public class BounceBall {
    public static void main(String args[]) {

        JFrame f = new JFrame("Bouncing Ball");

        BallPanel p = new BallPanel();

        f.add(p);

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}