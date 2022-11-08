
package beecrowd;

import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        
        if(start < end){
            System.out.println("O JOGO DUROU "+(end-start)+" HORA(S)");
        }
        else if(start > end){
            System.out.println("O JOGO DUROU "+((24-start)+end)+" HORA(S)");
        }
        else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
