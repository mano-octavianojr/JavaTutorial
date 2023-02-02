/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesObjects2;

public class Sample1 {

    // Instance variable
    String name = "None";
    int x = 0;
    int y = 0;

    // NOTE: No computation in constructor.
    // Initialize all values ONLY!
    
    // Constructor. 
    public Sample1() {
    }

    // Constructor. OVERLOAD
    public Sample1(String realName) {
        name = realName;
    }

    public Sample1(int num1, int num2) {
        x = num1;
        y = num2;
    }

    // Instance method
    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Sample1 obj1 = new Sample1("Manolito");
        System.out.println(obj1.getName());

        Sample1 obj2 = new Sample1();
        System.out.println(obj2.getName());
    }
}
