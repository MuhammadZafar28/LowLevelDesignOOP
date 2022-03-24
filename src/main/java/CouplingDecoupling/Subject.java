/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CouplingDecoupling;

/**
 *
 * @author MoaathAlrajab
 * 
 * 
 * In the example, three Classes, “month1”, “month2”, “month3” are independent 
 * modules, and they collaborate little with each other through an interface 
 * “iface”. As a result, these classes have very little knowledge of the other 
 * classes on what they are doing. They only know that all the classes are 
 * interacting with an interface.
 * There is no object created using the other classes in any of these 
 * classes, and they are the typical examples of loose coupling.
* 
* 
 */
// Loose Coupling in JAVA - Sample Program
interface Iface //Interface is defined
{
    public void monthname(); //module within the interface
}

class Month1 implements Iface { // Class interacts through

    public void monthname() // interface
    {
        System.out.println("January");
    }
}

class Month2 implements Iface { // Class interacts through

    public void monthname() // interface
    {
        System.out.println("Feburary");
    }
}

class Month3 implements Iface { // Class interacts through

    public void monthname() // interface
    {
        System.out.println("March");
    }
}

public class Subject { // Execution starts here

    public static void main(String[] args) {
        Iface t = new Month1(); // First class called thru
        t.monthname(); // interface
        Iface tx = new Month2(); // Second class called thru
        tx.monthname(); // interface
        Iface tx2 = new Month3(); // Third class called thru
        tx2.monthname();
    } // interface
}
