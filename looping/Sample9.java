package looping;

public class Sample9 {

    public static void main(String[] args) {
        int sum = 0;

        for (int counter = 1; counter < 3; counter++) {
            for (int anotherCounter = 1; anotherCounter < 3; anotherCounter++) {
                sum = counter + anotherCounter;
            }
        }

        System.out.println("sum: " + sum);
    }
}
