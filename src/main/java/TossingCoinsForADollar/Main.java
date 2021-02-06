/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TossingCoinsForADollar;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {

        double dollarCap = 1;
        double moneyCounter = 0;
        double coinCost = 0;
        
        while (moneyCounter < dollarCap){
            Coin firstCoin = new Coin();
            String coinFlip = firstCoin.flip();
            String coinValue = firstCoin.determineValue();
            // Assigns value to coincost based on the coinvalue method
            if (coinValue.equals("Nickel")) {
                    coinCost = .05;
            } else if (coinValue.equals("Dime")) {
                    coinCost = .1;
            } else if (coinValue.equals("Quarter")) {
                    coinCost =.25;
            }
            if (coinFlip.equals("Heads")) {
                moneyCounter += coinCost;
            } else if (coinFlip.equals("Tails")) {
                System.out.println("Since the flip was tails it does not count");
            }

            System.out.println(moneyCounter);
            if (moneyCounter == 1) {
                System.out.println("You hit exactly 1, you win the game.");
            } else if (moneyCounter > 1){
                System.out.println("You went over 1, you did not win the game");
            }
        }
    }
}
