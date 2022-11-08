
package LongExam2;

import java.util.Random;

public class InBetween {
    public static void main(String[] args) {
        String firstCard = pickCard();
        System.out.println("The first card you picked is "+firstCard);
        String secondCard = pickCard();
        System.out.println("The second card you picked is "+secondCard);
        String thirdCard = pickCard();
        
        int firstValue = getCardValue(firstCard);
        int secondValue = getCardValue(secondCard);
        int thirdValue = getCardValue(thirdCard);
        
        if(thirdValue > firstValue && thirdValue < secondValue){
            System.out.println("The drawn card is "+ thirdCard +", you won!");
        }
        else if(thirdValue < firstValue && thirdValue > secondValue){
            System.out.println("The drawn card is "+ thirdCard +", you won!");
        }
        else{
            System.out.println("The drawn card is "+ thirdCard +", you lose.");
        }
    }
    
    public static int getCardValue(String card){
        if(card.charAt(0) == 'A'){
            return 1;
        }
        else if(card.charAt(0) == 'J'){
            return 11;
        }
        else if(card.charAt(0) == 'Q'){
            return 12;
        }
        else if(card.charAt(0) == 'K'){
            return 13;
        }
        String s = ""+ card.charAt(0);
        return Integer.parseInt(s);
    }
    
    public static String pickCard(){
        Random rand = new Random();
        int card_gen = rand.nextInt(13) + 1;
        int suit_gen = rand.nextInt(4) + 1;
        
        String suit = "";
        String card = "";
        
        switch(suit_gen){
            case 1: suit = "Clubs";
                    break;
            case 2: suit = "Diamonds";
                    break;
            case 3: suit = "Hearts";
                    break;
            case 4: suit = "Spades";
                    break;
        }
        
        if(card_gen == 1){
            card = "Ace";
        }
        else if(card_gen == 11){
            card = "Jack";
        }
        else if(card_gen == 12){
            card = "Queen";
        }
        else if(card_gen == 13){
            card = "King";
        }
        else{
            card = "" + card_gen;
        }
        
        return card + " of " + suit;
    }
}
