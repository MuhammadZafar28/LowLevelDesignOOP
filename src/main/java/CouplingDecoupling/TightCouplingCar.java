/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CouplingDecoupling;

/**
 *
 * @author MoaathAlrajab
 */
public class TightCouplingCar {
}
    


 class Car  {
  
    public void move() {
         System.out.println("Car is moving");
    }
}

class Traveler {
    Car c = new Car();
    public void startJourney() {
         c.move();
    }
}

