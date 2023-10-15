/*911
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car car = new Car ("Porsche 911 " , "Sport", 2,150);
        Helicopter helicopter = new Helicopter("EC 155", "Utility", 10);
        Boat boat = new Boat("Lancha Boat","Fast Motor", 4);
        

        System.out.println(car);
        System.out.println(helicopter);
        System.out.println(boat);
    }
    
}
