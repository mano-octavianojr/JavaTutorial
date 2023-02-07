package Swing;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Sample3 {

    public static void main(String args[]) {
        JFrame f = new JFrame("TextField Example");
        JTextField textfield1, textfield2;

        // Creating a textfield1
        textfield1 = new JTextField();
        textfield1.setToolTipText("This is a tip");
        textfield1.setBounds(50, 100, 200, 30);

        textfield2 = new JTextField("AWT Tutorial");
        textfield2.setBounds(50, 150, 200, 30);

        // Try creating a textArea
        JTextArea area = new JTextArea();
        area.setBounds(50, 200, 200, 30); 

        f.add(textfield1);
        f.add(textfield2);
        f.add(area);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
