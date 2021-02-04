/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FreezingAndBoiling_11;

/**
 *
 * @author drewm
 */
public class FreezeBoil {
    static int ethylAlcoholFreezingPoint = -173;
    static int ethylAlcoholBoilingPoint = 172;
    static int oxygenFreezingPoint = -362;
    static int oxygenBoilingPoint = -306;
    static int waterFreezingPoint = 32;
    static int waterBoilingPoint = 212;
    public int temperature;

    public FreezeBoil(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    // checks if temp would freeze Ethyl 
    static boolean isEthylFreezing(int temperature) {
        if (temperature <= ethylAlcoholFreezingPoint) {
            return true;
        } else
            return false;
    }
    // Checks if temp would boil Ethyl 
    static boolean isEthylBoiling(int temperature) {
        if (temperature >= ethylAlcoholBoilingPoint) {
            return true;
        } else
            return false;
    }
    
    static boolean isOxygenFreezing(int temperature) {
        if (temperature <= oxygenFreezingPoint) {
            return true;
        } else 
            return false;
    }
    
    static boolean isOxygenBoiling(int temperature) {
        if (temperature >= oxygenBoilingPoint) {
            return true;
        } else 
            return false;
    }
    
    static boolean isWaterFreezing(int temperature) {
        if (temperature <= waterFreezingPoint) {
            return true;
        } else 
            return false;
    }
    
    static boolean isWaterBoiling(int temperature) {
        if (temperature >= waterFreezingPoint) {
            return true;
        } else 
            return false;
    }
    
}
