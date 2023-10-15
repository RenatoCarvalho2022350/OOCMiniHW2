/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Renato
 */
public class Helicopter extends Vehicle implements Flyable  {

    
       private final float altitude = 0;
    
    
    public Helicopter(String make, String type, int numPassengers ) {
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        numWings = 1; //helicopter one
        
    }

       @Override
    public float getAltitude() {
        return altitude;
    }

       @Override
    public float getSpeed() {
        return speed;
    }

       @Override
    public float getDirection() {
        return direction;
    }

       @Override
    public String getMake() {
        return make;
    }

       @Override
    public String getType() {
        return type;
    }

    @Override
    public void changeAltitude(float change) { 
    }// Implement the altitude change logic for helicop

    @Override
    public void accelerate(float speed) {
    }  // Implement the acceleration logic for helicopt

    @Override
    public void brake() {
    } // Implement the braking logic for helicop

    @Override
    public void turn(float angle) {
    }  // Implement the turning logic for an heli
    
    @Override
    public String toString() {
    return "Helicopter = " + make + ", type = " + type + ", speed = " + speed + ", direction = " + direction + ", altitude = ";
}

    
  
    
    

}
