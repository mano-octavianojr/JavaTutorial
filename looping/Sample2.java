package looping;


public class Sample2 {

    public static void main(String[] args) {
        int sum = 0;

        for (int counter = 0; counter < 10; counter++) {
            if (counter % 2 == 0) {
                sum += counter;
            }
         
        }

        System.out.println("sum: " + sum);
    }
}
