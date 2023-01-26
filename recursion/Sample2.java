package recursion;

public class Sample2 {

    public static void main(String[] args) {

        // Call the method
        int retun_value = sumNumber(0);
        System.out.println("return_value: " + retun_value);
    }

    /**
     * @param number start of the recursion
     *
     * @return sum of numbers from start to 3
     */
    public static int sumNumber(int number) {

        // The condition will tell if we need to continue calling the method.
        if (number < 3) {

            // print
            System.out.println("count: " + number);

            // Call again the method. This time, increment by 1.
            // Tricky part! you need to go to the ELSE part before you add everything.
            return (number + sumNumber(number + 1));
        } else {

            System.out.println("There is a false.");
            return 3;
        }

    }
}
