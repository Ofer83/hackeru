package com.company;

/**
 * Created by hackeru on 6/18/2015.
 */
public class Poodel extends Dog {
    int height;
    int weight;
    @Override
    public String toString() {
        return "Poodel("+name+")* size = ("+weight+") and higth = ("+height+")";
    }
    @Override
    public void eating(String food) {
        super.eating(food); //innherit the fanction from the father
        //System.out.println("Poodel("+name+")*is eating .." + food);
    }
    @Override
    public void bark (String sound){
        System.out.println(sound + sound + sound + "...I am a Poodel *("+name+")*");
    }
}
