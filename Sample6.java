package Swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Sample6 {

    public static void main(String[] args) {
        JFrame f = new JFrame();

        // Creating a RadioButtons
        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) Female");

        r1.setBounds(75, 50, 100, 30);
        r2.setBounds(75, 100, 100, 30);

        // You only want the user to choose ONE in the options.
        // Put all options in one buttongroup.
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        //bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
