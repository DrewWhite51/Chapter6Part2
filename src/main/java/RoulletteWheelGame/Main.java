/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoulletteWheelGame;

import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number on the roulette wheel, "
                + "0-36, and I will tell you the color of the pocket that"
                + " you have chosen!");
        int userInput = keyboard.nextInt();
        RoulettePocket pocket = new RoulettePocket(userInput);
        System.out.println(pocket.getPocketColor(userInput));
        
    }
}
