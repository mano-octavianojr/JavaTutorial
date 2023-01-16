package ClassesObjects;

public class Sample5 {

    // public - access modifier. Disregard for the meantime.
    // static - it can be accessed without creating an object of the class
    // void - no return value
    public static void method1() {
        System.out.println("static method1()");
    }

    // public - access modifier. Disregard for the meantime.
    // static - it can be accessed without creating an object of the class
    // void - no return value
    public void method2() {
        System.out.println("inside method2()");
    }

    public static void main(String[] args) {

        Sample5.method1();

        Sample5 object = new Sample5();
        object.method2();

    }

}
