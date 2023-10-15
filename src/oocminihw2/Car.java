/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Renato
 */
public class Car extends Vehicle implements Drivable{

    public Car(String make, String type, int numPassengers, float speed) {
        this.make = make;
        this.type = type;
        this.speed = speed;
        this.numPassengers = numPassengers;
        numWheels = 4;
        
    }

    @Override
    public void accelerate(float speed) {

    }

    @Override
    public void brake() {
        
    }

    @Override
    public void turn(float angle) {
        
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
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
    public String toString() {
    return "Car = " + make + ", type = " + type + ", speed = " + speed  ;
}

    
    
}
