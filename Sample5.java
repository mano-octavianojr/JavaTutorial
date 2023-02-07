package Swing;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Sample5 {

    public static void main(String[] args) {

        JFrame f = new JFrame("CheckBox Example");

        // Creating a CheckBox
        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 50, 50);

        // Creating a CheckBox
        JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100, 150, 50, 50);
        
        f.add(checkBox1);
        f.add(checkBox2);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
