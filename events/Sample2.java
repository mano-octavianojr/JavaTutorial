/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author mvoctavianojr
 */
public class Sample2 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JRadioButton rb1, rb2;
        JButton b;

        rb1 = new JRadioButton("Male"); // Serve as identity of the button
        rb1.setBounds(100, 50, 100, 30);

        rb2 = new JRadioButton("This is a female");
        rb2.setActionCommand("Female"); // Alternative Identity of the radiobutton.
        rb2.setBounds(100, 100, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        b = new JButton("click");
        b.setBounds(100, 150, 80, 30);

        EventListener listen = new EventListener();

        b.addActionListener(listen);
        rb1.addActionListener(listen);
        rb2.addActionListener(listen);

        f.add(rb1);
        f.add(rb2);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

class EventListener implements ActionListener {

    // Override the method
    @Override
    public void actionPerformed(ActionEvent e) {

        // Get the component.
        Object component = e.getSource();

        // Check what EXACT component.
        if (component instanceof JRadioButton) {
            JRadioButton radiobutton = (JRadioButton) component;

            // Display the action
            System.out.println("action: " + radiobutton.getActionCommand());
            // Perform output if this is a radiobutton.
            if (radiobutton.getActionCommand().equalsIgnoreCase("male")) {
                System.out.println("male");
            } else if (radiobutton.getActionCommand().equalsIgnoreCase("female")) {
                System.out.println("female");
            }
        } else if (component instanceof JButton) {

            System.out.println("Click!");
        }
    }
}
