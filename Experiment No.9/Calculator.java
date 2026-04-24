import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField tf;
    String num1 = "", num2 = "", operator = "";

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4, 5, 5));

        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+",
                "C","√","x²","%"
        };

        for(String b : buttons){
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            p.add(btn);
        }

        add(p, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if(cmd.matches("[0-9.]")) {
            tf.setText(tf.getText() + cmd);
        }
        else if(cmd.matches("[+\\-*/%]")) {
            num1 = tf.getText();
            operator = cmd;
            tf.setText("");
        }
        else if(cmd.equals("=")) {
            num2 = tf.getText();
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            double result = 0;

            switch(operator) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break;
                case "%": result = a % b; break;
            }

            tf.setText("" + result);
        }
        else if(cmd.equals("C")) {
            tf.setText("");
        }
        else if(cmd.equals("√")) {
            double a = Double.parseDouble(tf.getText());
            tf.setText("" + Math.sqrt(a));
        }
        else if(cmd.equals("x²")) {
            double a = Double.parseDouble(tf.getText());
            tf.setText("" + (a*a));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}