package ClassesObjects;

public class Sample6 {

    // public - access modifier. Disregard for the meantime.
    // static - it can be accessed without creating an object of the class
    // String - return value
    public static String method1() {
        System.out.println("static method1()");

        String name = "Manolito";
        return name;
    }

    // public - access modifier. Disregard for the meantime.
    // static - it can be accessed without creating an object of the class
    // int - return value
    public int method2() {
        System.out.println("inside method2()");

        int value = 199;
        return value;
    }

    public static void main(String[] args) {

        String returned_str = Sample6.method1();
        System.out.println("Main: " + returned_str);

        Sample6 object = new Sample6();
        int returned_int = object.method2();
        System.out.println("Main: " + returned_int);

    }

}
