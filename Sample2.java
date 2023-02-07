package Swing;

// Hint: Netbeans: ctrl + shift + i
//       Eclipse: alt + shift + o
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample2 {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setTitle("New Label Title");
        JLabel label1, label2;

        // Creating a label
        label1 = new JLabel("First Label.");
        label1.setBounds(50, 50, 100, 30); // Setting position and size of a label

        // Another label
        label2 = new JLabel();
        label2.setText("Second Label.");
        label2.setBounds(50, 100, 100, 30);

        // Always put the different components in the frame.
        f.add(label1);
        f.add(label2);

        // Always include the codes below.
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
