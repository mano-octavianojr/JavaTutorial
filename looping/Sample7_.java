package looping;

public class Sample7_ {

    public static void main(String[] args) {
        int number = 0;
        int anotherNumber = 0;

        for (int counter = 0; counter < 5; counter++) {
            number += counter;
            anotherNumber += number;

            if (anotherNumber > 5) {
                break;
            }
        }
    }
}
