package conditional;

public class Sample6 {

    public static void main(String[] args) {
        int number = 1;
        int anotherNumber = 3;

        if (number < anotherNumber) {
            System.out.println("Inside if.");
        } else if (number > anotherNumber) {
            System.err.println("Inside 1st else if.");
        } else {
            System.err.println("Inside else part.");
        }
    }
}
