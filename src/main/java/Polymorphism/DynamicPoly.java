/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author MoaathAlrajab
 */

class Interrogator{
    public static void convinceToTalk(Animal subject) {
        subject.talk();
    }
}

// We don't want anyone creating an animal object!
abstract class Animal {
    public abstract void talk();
}

class Dog extends Animal {
    public void talk() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void talk() {
        System.out.println("Meow!");
    }
}

public class DynamicPoly {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Dog();
        
        Interrogator.convinceToTalk(dog); //prints "Woof!"
        Interrogator.convinceToTalk(cat); //prints "Meow!"
        Interrogator.convinceToTalk(animal); //prints "Woof!"
    }
}

