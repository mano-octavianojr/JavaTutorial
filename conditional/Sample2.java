package conditional;

public class Sample2 {

    public static void main(String[] args) {

        int number = 1;
        int anotherNumber = 5;

        // NOTE: Always put parentheses.
        if ((number < 5) && (anotherNumber > 3)) {
            System.out.println("inside the if statement.");
        }

        System.out.println("outside if statement.");
    }
}
