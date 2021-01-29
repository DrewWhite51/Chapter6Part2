/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwentyOneGame_10;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userDice = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        int compDice = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        int playerScore = 0;
        
        
        System.out.println("Do you want to play 21? (y/n)");
        String playDecision = keyboard.nextLine();
        if (playDecision.equals("y")) {
            System.out.println("Your initial roll is " + userDice + ". Do you want"
                    + "to hit again? (y/n)");
            String hitAgain = keyboard.nextLine();
            
            if (hitAgain.equals("y")) {
                System.out.println("You hit again");
            } else {
                System.out.println("You chose to not hit again"); 
                if (userDice < compDice) {
                    System.out.println("You lost to the compter, they had " + compDice + 
                            " and you had " + userDice+ ".");
                }
            }
        } else {
            System.out.println("No gamen");
        }
        
        
        
    }
}
