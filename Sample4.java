package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Sample4 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");

        // Check how this differ from textField and textArea
        JTextField user = new JTextField();
        user.setBounds(100, 130, 100, 30);

        JLabel label2 = new JLabel("Username:");
        label2.setBounds(20, 130, 80, 30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 100, 100, 30);
        JLabel label1 = new JLabel("Password:");
        label1.setBounds(20, 100, 80, 30);

        f.add(pass);
        f.add(label1);
        f.add(user);
        f.add(label2);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
