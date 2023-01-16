package ClassesObjects;

public class Sample7 {

    // public - access modifier. Disregard for the meantime.
    // static - it can be accessed without creating an object of the class
    // void -  no return value
    // argument/s: arg1 - value/s that we need to pass to the method.
    public static void method1(String arg1) {
        System.out.println("static method1()");

        System.out.println("Name passed: " + arg1);
    }

    // public - access modifier. Disregard for the meantime.
    // static - it can be accessed without creating an object of the class
    // int - return value
    // argument/s: arg1, arg2 - value/s that we need to pass to the method.
    public int method2(int number1, int number2) {
        System.out.println("inside method2()");

        int sum = number1 + number2;
        return sum;
    }

    public static void main(String[] args) {

        // Need to pass 1 parameter
        Sample7.method1("Manolito"); // NOTE: parameter vs argument.

        Sample7 object = new Sample7();
        int x = 3;
        int y = 2;
        int returned_int = object.method2(x, y);
        System.out.println("Main: " + returned_int);

    }

}
