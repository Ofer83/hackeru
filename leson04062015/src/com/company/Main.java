package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println(printLine(19, 5, 2, 9));
        int[] x = new int[5];
        x[0] = 11;
        x[1] = 21;
        x[2] = 131;
        x[3] = 41;
        x[4] = 51;
        printA(x);
        //System.out.println(" max array= " + max(x));
        //System.out.println(" sum array= " + sum(x));
        //System.out.println(" howManyInRange= " + howManyInRange(x, 21, 51));
        //printA(subarray(x, 21, 51));
        //printA(changeRange(x));
        reverseArray(x);
        printA(x);
        int[][] multiArray = new int[3][5]; // array of arrayes 3X5..........
        System.out.println(multiArray.length); // = 3 length !!!
        multiArray[2][3]=1;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + ",");
            }
            System.out.println();;
        }
        boolean[][] canvas = new boolean[10][12];
        canvas[2][5] = true;
        canvas[4][6] = true;
        canvas[1][3] = true;
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] ? "*" :" ");// if true =* else = " "
            }
            System.out.println();;
        }
    }

    public static void reverseArray(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length-i-1];
            x[x.length-i-1]=temp;
        }
    }
    public static void sortArray(int[] x) {


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

    public static int max(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            result = ((result > x[i]) ? result : x[i]);
        }
        return result;
    }

    public static int sum(int[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i];
        }
        return result;
    }

    public static int howManyInRange(int[] x, int min, int max) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= min && x[i] < max) {
                count++;
                }
            }
        System.out.println("min " + min + " max " + max);
        return count;
        }
    public static int[] subarray(int[] x, int min, int max) {
        //int length = howManyInRange(int[] x, int min, int max);
        //int[] resulta = new int[howManyInRange(int[] x, int min, int max)];
        int[] resulta = new int[2];
        int counter = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= min && x[i] < max) {
                resulta[counter++] = x[i];
            }
        }
        return resulta;
    }
    public static int[] changeRange(int[] x) {
        int[] convert = new int[x.length];
        for (int i = 0; i < x.length; i++) {
              convert[(x.length - i-1)] = x[i];
            }
        return convert;
        }

    public static int dist(int x, int y) {
        int small = x;
        int large = y;
        if (x > y) {
            small = y;
            large = x;
        }
        int result = 0;
        while (small + result < large)
            result++;
        return result;
    }
    public static int printLine(int x1, int y1, int x2, int y2){
        int ymin = ((y2>y1) ? y1 : y2);
        int xmin = ((x2>x1) ? x1 : x2);
        int w = dist(x1,x2) + 2;
        int h = dist(y1,y2) + 2;
        for (int i = 0; i < ymin; i++) {
            System.out.println();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < xmin; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < w; j++) {
                System.out.print(((i==x1 && j==y1) || (i==x2 && j==y2)) ? "*" : " ");
            }
            System.out.println();
        }
        int result = h;
        return result;

    }
}
