package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog chipsy = new Dog();
        chipsy.name = "chipsy";
        Animal baffi = new Dog();
        baffi.name = "baffi";
        Poodel snow = new Poodel();
        snow.name = "snow";
        Dog flafi = new Poodel();
        flafi.name = "flafi";
        Cat yoyo = new Cat();
        yoyo.name = "yoyo";
        Animal julia = new Cat();
        julia.name = "julia";

        System.out.println(chipsy);
        chipsy.bark("wofffff");
        chipsy.eating("meat");
        System.out.println(baffi);
        baffi.eating("evrything!!!!");
        //baffi.bark("hohohoh"); Error no function bark in Animal class///
        //Dog temp = (Dog)baffi; // casting
        //temp.bark("hohohohoh");
        //((Dog) baffi).bark(); // the same as line above ^^
        //((Dog)baffi).bark("hohohoho"); // another option
        if (baffi instanceof Dog)
            ((Dog)baffi).bark("HOOOOOOOO");
        System.out.println(snow);
        snow.eating("nothing");
        snow.bark("wpwpwpwpwp");
        System.out.println(flafi);
        flafi.bark("fifififi");
        flafi.eating("choooo");
        //System.out.println(baffi.getAge(2000));
        Animal[] zoo = new Animal[4];
        zoo[0] = new Dog();
        zoo[1] = new Cat();
        zoo[2] = new Animal();
        zoo[3] = new Poodel();
        zoo[0].yearOfBirth = 1900;
        zoo[0].name = "new dog";
        zoo[1].yearOfBirth = 1990;
        zoo[2].yearOfBirth = 2000;
        zoo[3].yearOfBirth = 1980;
        Animal oldestInZoo = findOldestAnimal(zoo);
        System.out.println(oldestInZoo.name);
    }
    public static Animal findOldestAnimal (Animal[] listOfAnimals){
        Animal oldest = listOfAnimals[0];
        for (int i = 1; i < listOfAnimals.length; i++) {
            if ( listOfAnimals[i].getAge()>oldest.getAge())
                oldest = listOfAnimals[i];
        }
        return oldest;
    }


}
