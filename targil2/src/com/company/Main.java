package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(quot(0, 9));
    }
    public static int quot(int x, int y) {
        int result = y;
        int count = 0;
        if (y==0)
            return -1;
        while (result<=x){
            result+=y;
            count++;
        }
        return count;


    }
}
