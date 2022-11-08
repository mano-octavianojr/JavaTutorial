
package beecrowd;

import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        
        if(x > y && x > z){
            if(y < z){
                System.out.println(y+"\n"+z+"\n"+x);
            }
            else{
                System.out.println(z+"\n"+y+"\n"+x);
            }
        }
        else if(y > x && y > z){
            if(x < z){
                System.out.println(x+"\n"+z+"\n"+y);
            }
            else{
                System.out.println(z+"\n"+x+"\n"+y);
            }
        }
        else{
            if(x < y){
                System.out.println(x+"\n"+y+"\n"+z);
            }
            else{
                System.out.println(y+"\n"+x+"\n"+z);
            }
        }
        System.out.println("");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
