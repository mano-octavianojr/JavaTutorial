package looping;

public class Sample1_1 {

    public static void main(String[] args) {

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("counter: " + counter);

            if (counter == 3) {
                break;
            }
        }
    }
}
