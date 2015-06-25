package com.company;

/**
 * Created by hackeru on 6/18/2015.
 */
public class Cat extends Animal{
    int height;
    int weight;
    public Cat(){
        height = 10;
        weight = 15;
    }
    @Override
    public String toString() {
        return "Cat("+name+")* size = ("+weight+") and higth = ("+height+")";
    }
    @Override
    public void eating(String food) {
        System.out.println("Cat("+name+")* is eating .." + food);
    }
    public void sound (String sound){
        System.out.println("Cat:("+name+"):" + sound + "...." + sound + "...." + sound + "...." );
    }
}
