/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FreezingAndBoiling_11;

import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the temperature to determine it "
                + "the chemicals are freezing or boiling");
        int userTemp = keyboard.nextInt();
        
        FreezeBoil checkTemps = new FreezeBoil(userTemp);
        if (userTemp <= 32) {
            System.out.println("Ethyl Alcohol Freezing: " + checkTemps.isEthylFreezing(userTemp) );
            System.out.println("Oxygen Freezing: " + checkTemps.isOxygenFreezing(userTemp));
            System.out.println("Water Freezing: " + checkTemps.isWaterFreezing(userTemp));
        } else if (userTemp >= 172) {
            System.out.println("Ethyl Alcohol Boiling: " + checkTemps.isEthylBoiling(userTemp));
            System.out.println("Oxygen Boiling: " + checkTemps.isOxygenBoiling(userTemp));
            System.out.println("Water Boiling: " + checkTemps.isWaterBoiling(userTemp));
        } else {
            System.out.println("With the temperature you gave none of the substances"
                    + " will freeze nor boil.");
        }
        
    }
}
