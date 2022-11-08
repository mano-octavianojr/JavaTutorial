package array;

public class Sample3 {

    public static void main(String[] args) {
        int[] array = {2, 4, 8, 0, 5};

        for (int index = 0; index < array.length; index++) {
            if (index % 2 == 0) {
                System.out.println("value: " + array[index]);
            }
        }
    }
}
