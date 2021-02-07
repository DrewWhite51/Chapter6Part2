/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingGameSim;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author drewm
 */
public class Fish {
    int points;
    String fishType;

    public Fish() {
        this.points = points;
        this.fishType = fishType;
    }
    
    public int rollDie(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return randomNum;
    }
    
    public String catchFish( int randomNumber) {
        switch (randomNumber) {
            case 1:
                this.fishType = "A shark";
                break;
            case 2:
                this.fishType = "A swordfish";
                break;
            case 3:
                this.fishType = "A sting ray";
                break;
            case 4:
                this.fishType = "A tuna";
                break;
            case 5:
                this.fishType = "A bass";
                break;
            case 6:
                this.fishType = "A boot";
                break;
            default:
                break;
        }
        return this.fishType;
    }
    
    public int fishPoints(int randomNum) {
        switch (randomNum) {
            case 1:
                this.points = 10;
                break;
            case 2:
                this.points = 8;
                break;
            case 3:
                this.points = 6;
                break;
            case 4:
                this.points = 4;
                break;
            case 5:
                this.points = 2;
                break;
            case 6:
                this.points = 0;
                break;
            default:
                break;
        }
        return this.points;
    }
    

    public int getPoints() {
        return points;
    }

    public String getFishType() {
        return fishType;
    }
    
    
}
