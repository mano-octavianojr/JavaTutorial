
package LongExam2;

import java.util.Scanner;

public class JavaExpress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        
        
        if(weight >= 0 && weight <= 3){
            System.out.println("Cost: Php 40");
        }
        else if(weight > 3 && weight <= 10){
            System.out.println("Cost: Php 60");
        }
        else if(weight > 10 && weight <= 25){
            System.out.println("Cost: Php 120");
        }
        else if(weight > 25 && weight <= 50){
            System.out.println("Cost: Php 200");
        }
        else if(weight > 50){
            System.out.println("Cannot be delivered.");
        }
    }
}
