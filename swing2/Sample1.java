package swing2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("ComboBox Example");

        // Creating a label that is centered aligned.
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);

        // Creating a button
        JButton button = new JButton("Show");
        button.setBounds(200, 100, 75, 20);

        // Creating a combo box.
        String languages[] = {"C", "C++", "C#", "Java", "PHP"};
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(50, 100, 90, 20);

        // adding everything to the frame.
        frame.add(cb);
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
        frame.setSize(350, 350);
        frame.setVisible(true);

    }
}
