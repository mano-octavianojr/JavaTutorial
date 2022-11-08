package array;

public class Sample5 {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5},
            {9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("row " + row + " col " + col + ": " + matrix[row][col]);
            }
        }
    }
}
