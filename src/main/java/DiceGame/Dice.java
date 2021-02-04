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
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceValue;
    
    public int rollDie(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return randomNum;
    }
}



