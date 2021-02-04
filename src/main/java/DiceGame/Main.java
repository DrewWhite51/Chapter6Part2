/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceGame;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        Dice userDice = new Dice();
        Dice computerDice = new Dice();
        int userWin = 0;
        int computerWin = 0;
        

        
        for (int counter = 1; counter<=10; counter++){
            int userRoll = userDice.rollDie();
            int computerRoll = computerDice.rollDie();
            System.out.println("-------------------------------------");
            System.out.println("You rolled a " + userRoll);
            System.out.println("The computer rolled a " + computerRoll);
            if (userRoll > computerRoll) {
                System.out.println("You won round " + counter);
                userWin++;
            } else {
                System.out.println("The computer won round " + counter);
                computerWin++;
            }
            System.out.println("-------------------------------------");
        }
        System.out.println("-------------------------------------");
        System.out.println("You won " + userWin + "/10");
        System.out.println("The computer won " + computerWin + "/10");
        if (userWin > computerWin) {
            System.out.println("You are the random dice roll grandmaster!");
        } else {
            System.out.println("The computer is the random dice roll grandmaster!");
        }
        System.out.println("-------------------------------------");
        
        
    }
}
