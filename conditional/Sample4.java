package conditional;

public class Sample4 {

    public static void main(String[] args) {

        int number = 1;
        int counter = 0;

        // QUESTION: How to evaluate this?
        number += 3;
        counter = counter + number;

        // NOTE: This is a complex logical operation.
        if ((number < 5) || (counter < number) && counter > 3) {
            System.out.println("inside the if statement - TRUE.");
        } else {
            System.out.println("inside the if statement - FALSE.");
        }

        System.out.println("outside if statement.");
    }
}
