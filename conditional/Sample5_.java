package conditional;

// QUESTION: What do you think is the output of the program?
public class Sample5_ {

    public static void main(String[] args) {

        int number = 1;
        int anotherNumber = 3;

        if (number < 3) {
            anotherNumber *= 3;
        }
        if (anotherNumber == number) {
            number = anotherNumber;
        } else {
            anotherNumber++;
        }

        System.out.println("sum: " + (number + anotherNumber));
    }
}
