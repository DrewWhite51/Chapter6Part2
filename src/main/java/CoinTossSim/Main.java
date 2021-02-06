/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoinTossSim;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        int headCounter = 0;
        int tailsCounter = 0;
       
        for (int counter = 1; counter <=20; counter++) {
            Coin myCoin = new Coin();
            String coinFlip = myCoin.flip();
            System.out.println("----------------------");
            System.out.println(coinFlip);
            System.out.println("----------------------");
            if ("heads".equals(coinFlip.toLowerCase().strip())) {
                headCounter++;
            }
            if ("tails".equals(coinFlip.toLowerCase().strip())) {
                tailsCounter++;
            }
            
        }
        System.out.println("The number of heads is " + headCounter +
                "/20");
        System.out.println("The number of tails is " + tailsCounter +
                "/20");
    }
}
