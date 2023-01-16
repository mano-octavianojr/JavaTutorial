package ClassesObjects;


public class Sample3 {

    // Instance Variables 
    int counter = 1;

    // Static/Class Variables - There would only be one copy of each class 
    // variable per class, regardless of how many objects are created from it.
    static int static_counter = 1;

    public static void main(String[] args) {

        //NOTE: Different way of accessing.
        System.out.println(Sample3.static_counter);

        // Instantiation of Object 1
        // Sample3 myObj1 = new Sample3();
        // System.out.println(myObj1.static_counter);
    }
}
