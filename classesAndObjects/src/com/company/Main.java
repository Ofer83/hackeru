package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p;  // pointer/reference to obj name Person
        p = new Person();  //create Obj that return only the location
        Ofer o = new Ofer();
        System.out.println(o);// print location.......
        Person ofer1 = new Person(); //create new Obj (ofer1) in the same class (Person)
        Dog d = new Dog();

        Person elad = new Person();
        elad.firstName = "Elad";
        elad.lastName = "LAvi";
        System.out.println("first name:" + elad.firstName);
        System.out.println("last name:" + elad.lastName);

        Person dana = new Person();
        dana.firstName = "Dana";
        dana.lastName = "Gdalia";
        System.out.println("first name:" + dana.firstName);
        System.out.println("last name:" + dana.lastName);
        Date danaBirthday = new Date();
        danaBirthday.year = 1963;
        danaBirthday.month = 3;
        danaBirthday.day = 6;
        System.out.println("Dana Birthday:" + danaBirthday.year + "/" + danaBirthday.month+"/"+danaBirthday.day);

        Person michal = new Person();
        michal.dateOfBirth = new Date();
        michal.dateOfBirth.year = 1962;
        michal.dateOfBirth.month = 8;
        michal.dateOfBirth.day = 9;
        System.out.println("Michal Birthday:" + michal.dateOfBirth.year + "/" + michal.dateOfBirth.month+"/"+michal.dateOfBirth.day);

    }
}
