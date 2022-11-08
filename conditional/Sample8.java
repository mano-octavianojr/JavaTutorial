package conditional;

public class Sample8 {

    public static void main(String[] args) {

        int number = 0;
        int anotherNumber = 1;

        if (number == 0) {
            System.out.println("inside the IF");
            if (anotherNumber == 1) {
                System.out.println("inside the INSIDE IF");
            } else {
                System.out.println("inside the INSIDE ELSE");
            }
        } else {
            System.out.println("inside the ELSE.");
        }
    }
}
