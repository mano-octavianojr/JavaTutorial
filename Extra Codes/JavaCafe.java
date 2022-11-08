
package LongExam2;

import java.util.Scanner;

public class JavaCafe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String name = in.nextLine();
        String size = in.nextLine();
        int qty = in.nextInt();
        double total = 0;
        
        if(size.equalsIgnoreCase("small")){
            total = 1.75 * qty;
        }
        else if(size.equalsIgnoreCase("regular")){
            total = 3.00 * qty;
        }
        else if(size.equalsIgnoreCase("large")){
            total = 4.25 * qty;
        }
        else{
            System.out.println("Invalid order");
        }
        System.out.printf("Total: %.2f\n", total);
    }
}
