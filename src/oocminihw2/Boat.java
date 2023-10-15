/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Renato
 */
public class Boat extends Vehicle implements Sailable {

    
    private boolean sailHoisted = false;
    
    public Boat(String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        numSails = 1; 
    }

    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
      sailHoisted  = false;
    }

    @Override
    public boolean isSailHoisted() {
     return sailHoisted;
    }

    @Override
    public void landHo() {
    }
    
    @Override
public String toString() {
    return "Boat = " + make + ", type = " + type + ", sailHoisted = " + sailHoisted;
}

    
    
}
