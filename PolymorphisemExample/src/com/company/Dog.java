package com.company;

/**
 * Created by hackeru on 6/18/2015.
 */
public class Dog extends Animal {
    int height;
    int weight;
    String name;
    public Dog(){
        height = 20;
        weight = 35;
        name = "new Dog";
    }
    @Override
    public String toString() {
        return "Dog("+name+")* size = ("+weight+") and higth = ("+height+")";
    }
    @Override
    public void eating(String food) {
        System.out.println("Dog("+name+")*is eating :" + food );
    }
    public void bark (String sound){
        System.out.println("Dog("+name+"): " + sound + "...." + sound + "...." + sound + "....");
    }
}
