/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingGameSim;

import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueFishing = "y";
        String startGame = "";
        int overallPoints = 0;
        
        System.out.println("Do you want to play my fishing game? (y/n)");
        startGame = keyboard.nextLine();
        if (startGame.equals("y")) {
            while (continueFishing.equals("y")) {
                Fish fishy = new Fish();
                // Gets the fish type and points
                int randomNum = fishy.rollDie();
                String displayFish = fishy.catchFish(randomNum);
                int fishPoints = fishy.fishPoints(randomNum);
                System.out.println("-------------------------");
                System.out.println("You cast your pole...");
                System.out.println("You feel something tugging");
                System.out.println("It is a " + displayFish +"!");
                System.out.println("This is worth " + fishPoints);
                overallPoints += fishPoints;
                System.out.println("Your total points is " + overallPoints);
                System.out.println("Do you want to conitnue fishing? (y/n)");
                System.out.println("-------------------------");
                continueFishing = keyboard.nextLine();
                if (continueFishing.equals("n")) {
                    System.out.println("-------------------------");
                    System.out.println("Thanks for playing");
                    System.out.println("Your total points were " + overallPoints);
                    System.out.println("-------------------------");
                    break;
                }
            }
        } else {
            System.out.println("That is too bad");
        }
    }
}
