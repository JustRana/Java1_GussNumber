//By Rana
package guessnumber;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int min = 0;
        int max = 100;
        int number;
        int guess;
        int atempts;
        String response;
        boolean play = true;
        
        while(play){
            atempts = 0;
            number = rand.nextInt(min , max+1);
            guess = 0;
            response = null;
            
            System.out.println("WELCOME TO SIMPLE GAME");
            
            
            while(guess != number){
              System.out.println("-----------------");  
              System.out.println("Enter Your Guess between 0 & 100"); 
              guess = input.nextInt();
              System.out.println("Guess is = " + guess);
              
              if(guess > number)
                  System.out.println("try ,Guess too high");
              else if(guess < number)
                  System.out.println("keep try ,Guess too low");
              atempts++;
            }
            
            System.out.println("Number is = " + number);
            System.out.println("-----------------");
            System.out.println("YOU WIN");
            System.out.println("-----------------");
            System.out.println("total atempts = " + atempts);
            
            
            System.out.println("-----------------");
            System.out.println("Do you want play again? Y/N");
            response = input.next();
            if(response.equalsIgnoreCase("Y"))
                play = true;
            else
                play = false;
        
        }
        System.out.println("-----------------");
        System.out.println("thanks for playing my game");
    }
    
}
