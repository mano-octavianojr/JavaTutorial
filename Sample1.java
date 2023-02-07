package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Sample1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();//creating instance of JFrame  

        // Create a button without any functionality.
        JButton button = new JButton();//creating instance of JButton
        button.setText("The Name");
        button.setBounds(130, 100, 200, 40);//x axis, y axis, width, height

        // Uncomment this.
        // JButton button2 = new JButton(); // no name
        
        // Always put the different components in the frame.
        frame.add(button);//adding button in JFrame  

        // Always include the codes below.
        frame.setSize(400, 500);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible  
    }
}
