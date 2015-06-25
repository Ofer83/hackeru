package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] x = {9,8,7,6,5,4,9,8,1};
        //int[] x = {1,2,2,3,4,4,4,4,5};
        int[] subx = {9,8,1};
        //int[] x = {1,2,2,3,4,4,4,4,5};
        printA(x);
        //System.out.println(indexOf(x, 9));
        System.out.println(indexOf2(x, subx));
        //printA(x);
        //sortArray(x);
        //printA(x);
    }
    public static int indexOf(int[] x, int y ){
        for (int i = 0; i < x.length; i++) {
            if (x[i]==y)
                return i;
        }
        return -1;
    }

    public static int indexOf2(int[] x, int[] subx ){
        int start = 0;
        int[] loc = new int[subx.length];
        int p = 0;
        for (int i = 0; i < subx.length; i++) {
            if (x.length - start < subx.length-i){
                return -1;
            }
            for (int j = start; j < x.length; j++) {
                if (subx[i]== x[j]) {
                    loc[p]= j;
                    p++;
                    start = j+1;
                    break;
                }
            }
        }
        return start-subx.length;
    }

    public static void printA(int[] x) {
        System.out.print("[");
        if (x.length>0) {
            for (int i = 0; i < x.length - 1; i++) {
                System.out.print(x[i] + ",");
            }
            System.out.print(x[x.length - 1]);
        }
        System.out.println("]");
    }

    public static void sortArray(int[] x ){
        for (int i = 0; i < x.length; i++) {
            int count = 0;
            for (int j = 0; j < x.length-1; j++) {
                if (x[j] > x[j+1]) {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                    count++;
                }
            }
            if (count == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
