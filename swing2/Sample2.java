/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author mvoctavianojr
 */
public class Sample2 {

    public static void main(String[] args) {

        // Creating menu/submenu variables.
        JMenu menu, submenu;
        JMenuItem i1, i2, i3, i4, i5;

        JFrame f = new JFrame("Menu and MenuItem Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");

        // Adding values.
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");

        // Adding values in the Menu.
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        // Adding values in the submenu
        submenu.add(i4);
        submenu.add(i5);
        // Combine
        menu.add(submenu);
        mb.add(menu);

        // Add everything in the frame.
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
