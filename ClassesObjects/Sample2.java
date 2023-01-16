package ClassesObjects;

public class Sample2 {

    // Instance Variables 
    int counter = 1;

    public static void main(String[] args) {
        // Instantiation of Object 1
        Sample2 myObj1 = new Sample2();

        // Instantiation of Object 1
        Sample2 myObj2 = new Sample2();
        System.out.println(myObj1.counter);
        System.out.println(myObj2.counter);

        // NOTE: Object 1 is different to object 2
        myObj1.counter = 2323;
        System.out.println(myObj1.counter);
        System.out.println(myObj2.counter);
    }
}
