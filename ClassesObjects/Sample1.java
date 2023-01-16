package ClassesObjects;

public class Sample1 {

    // Instance Variables - Instance variables are declared in a class, 
    // but outside a method, constructor or any block.
    int counter = 1;

    public static void main(String[] args) {
        // Instantiation of Object 1
        Sample1 myObj1 = new Sample1();

        // Instantiation of Object 1
        Sample1 myObj2 = new Sample1();
        System.out.println(myObj1.counter);
        System.out.println(myObj2.counter);

    }
}
