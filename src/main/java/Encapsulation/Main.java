/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author MoaathAlrajab
 */

 class Cat {

    private int mood = 50;
    private int hungry = 50;
    private int energy = 50;

    public void sleep() {
        System.out.println("Sleep ...");
        energy++;
        hungry++;
    }

    public void play() {
        System.out.println("Play ...");
        mood++;
        energy--;
        meow();
    }

    public void feed() {
        System.out.println("Feed ...");
        hungry--;
        mood++;
        meow();
    }

    private void meow() {
        System.out.println("Meow!");
    }

    public int getMood() {
        return mood;
    }

    public int getHungry() {
        return hungry;
    }

    public int getEnergy() {
        return energy;
    }
}

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        
        cat.feed();
        cat.play();
        cat.feed();
        cat.sleep();
        
        System.out.println("Energy: " + cat.getEnergy());
        System.out.println("Mood: " + cat.getMood());
        System.out.println("Hungry: " + cat.getHungry());
    }
}