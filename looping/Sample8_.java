package looping;

public class Sample8_ {

    public static void main(String[] args) {

        int counter = 0;

        int number = 0;
        int anotherNumber = 0;

        while (counter < 3) {

            number += 5;
            anotherNumber++;
            counter = anotherNumber;
        }

        System.out.println("sum: " + (number + anotherNumber));
    }
}
