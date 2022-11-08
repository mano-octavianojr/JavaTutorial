
package conditional_games;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int sum = add(x, y);
        System.out.println(square(x));
        System.out.println(sum);
    }
    
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
        // return a + b;
    }
    
    public static int square(int x){
        return x * x;
    }
    
    public static double square(double x){
        return Math.pow(x,2);
    }
    
    public static double squareRoot(double y){
        return Math.sqrt(y);
    }
}
