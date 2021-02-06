/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoulletteWheelGame;

/**
 *
 * @author drewm
 */
// 0 is green 
// 1-10 odd red
// 1-10 even black
// 11-18 odd black
// 11-18 even red
// 19-28 odd red
// 19-28 even black
// 29-36 odd black
// 29-36 even red
public class RoulettePocket {
    int pocketNumber; 

    public RoulettePocket(int pocketNumber) {
        this.pocketNumber = pocketNumber;
    }
    
    public String getPocketColor(int pocketNumber) {
        // The pocket is 0
        if (pocketNumber == 0 ) {
            return "The pocket is green";
        }// The pocket is even
        else if (pocketNumber%2==0) {
            if (pocketNumber>=1 && pocketNumber <=10) {
                return "The pocket is black";
            } else if (pocketNumber>=11&&pocketNumber<=18) {
                return "The pocket is red";
            } else if (pocketNumber>=19&&pocketNumber<=28) {
                return "The pocket is black";
            } else if (pocketNumber>=29&&pocketNumber<=36) {
                return "The pocket is red";
            }
            // Pockets are odd
        } else if (pocketNumber%2==1) {
            if (pocketNumber>=1 && pocketNumber <=10) {
                return "The pocket is red";
            } else if (pocketNumber>=11&&pocketNumber<=18) {
                return "The pocket is black";
            } else if (pocketNumber>=19&&pocketNumber<=28) {
                return "The pocket is red";
            } else if (pocketNumber>=29&&pocketNumber<=36) {
                return "The pocket is black";
            }
        } 
        
        return "Invalid number";
        
    }
    
}
