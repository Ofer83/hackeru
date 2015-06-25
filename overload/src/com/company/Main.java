package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Example 1:
        byte b = 9;
        aMethood(b); // short is active and not int becouse "byte"(1p) is more semilar to short(2P) then int
        aMethood(9); // this time 9=int
        Integer i = new Integer(9); // obj Integer
        Integer j = 9; // like int but object ( short write...)
        aMethood(i);
        */
        /*
        // example 2: with function "short" & "byte"
        //aMethood(9); //....error 9=int not short or byte!!!!
        aMethood((short)9); //  Ok with casting!!!!
        //byte b = 128; error only until 127...
        byte b = (byte)128; //casting will lose info sout= -128 (back to first)
                                      //byte is from -128.......127
        */
        // example 3
        //aMethood(9,10); // error cant decide can work only with 1

    }
    //public static void aMethood(int val){System.out.println("int");}
    //public static void aMethood(short val){System.out.println("short");}
    //public static void aMethood(byte val){System.out.println("byte");}
    //public static void aMethood(Object val){System.out.println("Object");}
    //public static void aMethood(String val){System.out.println("String");}

    public static void aMethood(long val1, int val){System.out.println("long+int");}
    public static void aMethood(int val, long val1){System.out.println("long+int");}
}
