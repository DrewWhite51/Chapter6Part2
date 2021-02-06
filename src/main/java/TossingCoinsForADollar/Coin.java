/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TossingCoinsForADollar;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author drewm
 */
public class Coin {
    String sideUp;
    String coinValue;

    public Coin() {
        this.sideUp = sideUp;
        this.coinValue = coinValue;
    }
    
    public String determineValue() {
        int coinValue = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if (coinValue==1) {
            this.coinValue = "Quarter";
        } if (coinValue==2) {
            this.coinValue = "Dime";
        } if (coinValue==3) {
            this.coinValue = "Nickel";
        } 
        return this.coinValue;
    }
    public String flip(){
        int headOrTails = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        if (headOrTails == 1) {
            this.sideUp = "Heads";
        } else if (headOrTails == 2) {
            this.sideUp = "Tails";
        }
        return this.sideUp;
    }

}
