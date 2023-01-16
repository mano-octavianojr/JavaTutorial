/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesObjects;

/**
 *
 * @author mvoctavianojr
 */
public class Sample4 {

    // Instance Variables
    int counter = 1;

    // Static/Class Variables
    static int static_counter = 1;

    // Final Instace or Static/Class Variables
    final int ICOUNTER = 1;
    final static int SCOUNTER = 1;

    public static void main(String[] args) {
        // Instantiation of Object 1
        Sample4 myObj1 = new Sample4();

        System.out.println(myObj1.ICOUNTER);
        System.out.println(Sample4.SCOUNTER);

        // Try changing the value.
        // myObj1.ICOUNTER = 3;
        // Sample4.SCOUNTER = 3;
    }

}
