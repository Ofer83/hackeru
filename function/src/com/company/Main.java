package com.company;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //myfun(); //to start my function
        //sum(2, 5);// cant view
        //   System.out.println(sum(2,5));// print 7
        System.out.println(product(20, 3));
    }

    //here to create function
    public static void myfun() {
        //void = nothing to return....
        System.out.println("in myfun()....");

    }

    public static int sum(int x, int y) {
        return x + y;

    }

    public static int product(int x, int y) {
    /*    int tot = 0;
        for (int i = 0; i < y; i++) {
            tot = tot + x;
        }
        return tot;
     */
        int small = x;
        int large = y;
        if (x>y) {
            small = y;
            large = x;
        }
            int result = 0;
            for (int i = 0; i < small; i++) {
                result += large;
            }
        return result;
        }
    public static int distance(int x, int y) {
        int small = x;
        int large = y;
        if (x>y) {
            small = y;
            large = x;
        }
        int result = 0;
        //for (int i = small; i < large; i++)
        //  result++; // in 1 line no need for {}
        while (small+result<large)
            result++; // in 1 line no need for {}
        return result;
    }
}
