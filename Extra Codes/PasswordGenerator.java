
package LongExam2;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String birthplace = in.nextLine();
        int birthMonth = in.nextInt();
        int birthDay = in.nextInt();
        int birthYear = in.nextInt();
        String zodiac = "";
        
        char initial = birthplace.charAt(0);
        if(birthMonth == 3){
            if(birthDay >= 21){
                zodiac = "Aries";
            }
            else{
                zodiac = "Pisces";
            }
        }
        if(birthMonth == 4){
            if(birthDay >= 20){
                zodiac = "Taurus";
            }
            else{
                zodiac = "Aries";
            }
        }
        if(birthMonth == 5){
            if(birthDay >= 21){
                zodiac = "Gemini";
            }
            else{
                zodiac = "Taurus";
            }
        }
        if(birthMonth == 6){
            if(birthDay >= 21){
                zodiac = "Cancer";
            }
            else{
                zodiac = "Gemini";
            }
        }
        if(birthMonth == 7){
            if(birthDay >= 23){
                zodiac = "Leo";
            }
            else{
                zodiac = "Cancer";
            }
        }
        if(birthMonth == 8){
            if(birthDay >= 23){
                zodiac = "Virgo";
            }
            else{
                zodiac = "Leo";
            }
        }
        if(birthMonth == 9){
            if(birthDay >= 23){
                zodiac = "Libra";
            }
            else{
                zodiac = "Virgo";
            }
        }
        if(birthMonth == 10){
            if(birthDay >= 23){
                zodiac = "Scorpio";
            }
            else{
                zodiac = "Libra";
            }
        }
        if(birthMonth == 11){
            if(birthDay >= 22){
                zodiac = "Sagittarius";
            }
            else{
                zodiac = "Scorpio";
            }
        }
        if(birthMonth == 12){
            if(birthDay >= 22){
                zodiac = "Capricorn";
            }
            else{
                zodiac = "Sagittarius";
            }
        }
        if(birthMonth == 1){
            if(birthDay >= 20){
                zodiac = "Aquarius";
            }
            else{
                zodiac = "Capricorn";
            }
        }
        if(birthMonth == 2){
            if(birthDay >= 19){
                zodiac = "Pisces";
            }
            else{
                zodiac = "Aquarius";
            }
        }
        
        System.out.println("Password: "+initial + birthMonth + birthDay + birthYear + zodiac);
    }
}
