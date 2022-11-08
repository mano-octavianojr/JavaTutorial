
package LongExam2;

import java.util.Random;
import java.util.Scanner;

public class SimpleDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int dividend = generateRandom();
        int divisor = generateRandom();
        
        if(divisor == 0){
            if(dividend == 0){
                dividend = generateRandom();
                divisor = generateRandom();
            }
        int temp = dividend;
        dividend = divisor;
        divisor = temp;
        }
        
        System.out.println("What is " + dividend + "/" + divisor + "?");
        int quotient = dividend / divisor;
        int answer = in.nextInt();
        
        if(answer == quotient){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("You are wrong. The correct answer is " + quotient);
        }
    }
    
    public static int generateRandom(){
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
