/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoinTossSim;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author drewm
 */
public class Coin {
    String sideUp;

    public Coin() {
        this.sideUp = sideUp;
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

    public String getSideUp() {
        return sideUp;
    }
    
    
}
