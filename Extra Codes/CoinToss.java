
package conditional_games;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    /* Create a program that will allow the user to toss a coin. If the coin is equal to 1,
    display heads, otherwise, display tails. The program should also allow users to toss again.*/
    
    public static void main(String[] args) {
        tossCoin();

    }
    
    public static void tossCoin(){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int coin = rand.nextInt(2)+1;
        
        if(coin == 1){
            System.out.println("Heads!");
        }
        else{
            System.out.println("Tails!");
        }
        
        System.out.println("Do you want to toss again? [Y/N]");
        Character toss = in.next().charAt(0);
        if(Character.toUpperCase(toss) == 'Y'){
            tossCoin();
        }
        else{
            System.out.println("EXIT");
        }
    }
}
