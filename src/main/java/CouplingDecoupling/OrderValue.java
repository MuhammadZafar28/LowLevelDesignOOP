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
 * Two collaborating classes in this example, “Ordervalue” and “order,” are 
 * interdependent. Calling class “Ordervalue” knows the business logic coded 
 * in the called class “order” accordingly, the code in the calling class is 
 * structured, and any change in the called class will upset the results of the 
 * program.
 * Hence it can be concluded that Classes “Ordervalue” and 
 * “Order” are tightly coupled.
 */
// Tight Coupling - Sample program
public class OrderValue // Calling class
{

    public static void main(String args[]) // method in the class
    {
        Order b = new Order(600, 5); // creating object for the called class
        System.out.println("value of the order is");
// order and execute it
        System.out.println(b.value); // Prints the order value computed by
    } // the called class
}

 class Order // Called class
{

    public int value; // method in the class

    Order(int orderquantity, int rate) // business logic
    {
        this.value = orderquantity * rate; // computing the value
    }
}
