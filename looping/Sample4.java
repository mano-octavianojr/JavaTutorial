package looping;

public class Sample4 {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        while (counter < 10) {

            if (counter % 2 == 0) {
                sum += counter;
            }

            counter++;
        }

        System.out.println("sum: " + sum);
    }
}
