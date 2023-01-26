package recursion;

public class Sample1 {

    public static void main(String[] args) {

        // Call the method
        displayNumber(0);
    }

    /**
     * @param number start of the recursion
     */
    public static void displayNumber(int number) {

        // The condition will tell if we need to continue calling the method.
        if (number <= 10) {

            // print
            System.out.println("count: " + number);

            // Call again the method. This time, increment by 1.
            displayNumber(number + 1);
        }

    }
}
