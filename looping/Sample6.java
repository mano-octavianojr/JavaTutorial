package looping;

public class Sample6 {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        do {
            if (counter % 2 == 0) {
                sum += counter;
            }
            counter++;
        } while (counter < 5);
    }
}
