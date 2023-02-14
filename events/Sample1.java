package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 'implements' keyword requires to implement all method(s)
// of the class/interface.
public class Sample1 implements ActionListener {

    JTextField textfield1, textfield2, textfield3;
    JButton b1, b2;

    Sample1() {
        JFrame frame = new JFrame();

        textfield1 = new JTextField();
        textfield1.setBounds(50, 50, 150, 20);

        textfield2 = new JTextField();
        textfield2.setBounds(50, 100, 150, 20);

        textfield3 = new JTextField();
        textfield3.setBounds(50, 150, 150, 20);
        textfield3.setEditable(false);

        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 50);

        b2 = new JButton("-");
        b2.setBounds(120, 200, 50, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);

        frame.add(textfield1);
        frame.add(textfield2);
        frame.add(textfield3);
        frame.add(b1);
        frame.add(b2);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = textfield1.getText();
        String s2 = textfield2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        }
        String result = String.valueOf(c);
        textfield3.setText(result);
    }

    public static void main(String[] args) {
        new Sample1();
    }
}
