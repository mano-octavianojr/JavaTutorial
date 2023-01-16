package ClassesObjects;

/**
 * NOTE: This is the concept of OVERLOADING. Check also how to properly document
 * (= javadoc).
 */
public class Sample8 {

    /**
     * This method will only display "method1"
     */
    public static void method1() {
        System.out.println("method1");
    }

    /**
     * This method will display "method1" and a name.
     *
     * @param name name of the user.
     */
    public static void method1(String name) {
        System.out.println("method1");
        System.out.println("name:" + name);
    }

    /**
     * This method will display "method1", name, and age.
     *
     * @param name name of user.
     * @param age age of user.
     */
    public static void method1(String name, int age) {
        System.out.println("method1");
        System.out.println("name:" + name);
        System.out.println("age: " + age);
    }

    /**
     * Another OVERLOADING.
     *
     * @param name name of user.
     * @param num1 first value.
     * @param num2 second value.
     *
     * @return sum of num1, num2
     */
    public static int method1(String name, int num1, int num2) {
        System.out.println("method1");
        return num1 + num2;
    }

    public static void main(String[] args) {

        Sample8.method1();
        Sample8.method1("Mano");
        Sample8.method1("Mano", 3);
        int returned_value = Sample8.method1("Mano", 3, 3);
        System.out.println("returned value: " + returned_value);

        // CHECK you access the methods.
        // Sample8.
    }
}
