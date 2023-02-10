/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mvoctavianojr
 */
public class Sample4b {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        // adding buttons to the frame       
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        // setting grid layout of 3 rows and 3 columns    
        f.setLayout(new GridLayout(3, 3));
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
