package com.company;

/**
 * Created by hackeru on 6/18/2015.
 */
public class Animal {
    String name;
    int height;
    int weight;
    int yearOfBirth;
    public Animal(){
        height = 0;
        weight = 0;
        name = "no name";
    }
    public String toString() {
        //return super.toString();
        return "("+name+")* animal size = ("+weight+") and higth = ("+height+")";
    }
    public void eating(String food){
        System.out.println("Animal("+name+")*is eating :" + food );
    }
    public int getAge(){
        return 2015-yearOfBirth;
    }

}
