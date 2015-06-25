package com.company;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        //System.out.println("mul " + x + "*" + y + " is: " + mul(x, y));
        //System.out.println("dist " + x + "-" + y + " is: " + dist(x, y));
        //System.out.println("divf " + y + " in " + x + "is: " + divf(x, y));
        //System.out.println("mod " + x + "%" + y + " is: " + mod(x, y));
        //System.out.println(" " + x + " power " + y + " is: " + power(x, y));
        //System.out.println(" " + x + " power1 " + y + " is: " + power1(x, y));
        //System.out.println(" " + x + " power2 " + y + " is: " + power2(x, y));
        //System.out.println(" sumD " + " is: " + sumD(n));
        //System.out.println(" sumOfDigits " + " is: " + sumOfDigits(123));
        System.out.println(" largestDigits " + " is: " + largestDigits(123));
        System.out.println(" convertDigits " + " is: " + convertDigits(123));
        System.out.println(" convertDigits2 " + " is: " + convertDigits2(123));
        drawRectangle(0,7,5,4);
        System.out.println();
        System.out.println();
        printX(9);
    }

    public static int mul(int x, int y) {
        int small = x;
        int large = y;
        if (x > y) {
            small = y;
            large = x;
        }
        int result = 0;
        for (int i = 0; i < small; i++) {
            result += large;
        }
        return result;
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

    public static int divf(int x, int y) {
        int result = y;
        int count = 0;
        if (y == 0)
            return -1;
        while (result <= x) {
            result += y;
            count++;
        }
        return count;
    }

    public static int mod(int x, int y) {
        //       return (x%y);
        if (y == 0)
            return -1;
        int result = dist(x, mul(divf(x, y), y));
        /*int d = dist(x, y);
        int f = divf(d, y);
        int fy = mul(f,y);
        int result = dist(d, fy);*/
        return result;
    }

    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        int resultj = x;
        for (int j = 1; j < y; j++) {
            int resulti = 0;
            for (int i = 0; i < resultj; i++)
                resulti += x;
            resultj = resulti;
        }
        return resultj;
    }

    public static int power1(int x, int y) {
        if (x == 0) {
            if (y == 0)
                return -1;
            return 0;
        }
        if (y == 0 || x == 1)
            return 1;
        int result = x;
        for (int i = 1; i < y; i++) {
            result = mul(result, x);
        }
        return result;
    }

    public static int power2(int x, int y) {
        if (x == 0) {
            if (y == 0)
                return -1;
            return 0;
        }
        if (y == 0 || x == 1)
            return 1;
        if (y == 1)
            return x;
        //Recursion......................-1.until stop at y==....
        int result = mul(power2(x, dist(y, 1)), x);
        return result;
    }

    /*public static int sumD(n) {
        int result = 0;
        do {
            result += n%10;
            n /= 10;
        }
        while (result>0);{
        }
        return result;
        }*/
    public static int sumOfDigits(int x){
        int result = 0;
        while (x>0){
            result += x%10;
            x /= 10;
        }
        return result;
    }
    public static int largestDigits(int x){
        int result = x%10;
        while (x>0){
            x/=10;
            if (x%10>result)
                result = x;
        }
        return result;
    }
    public static int convertDigits(int x){
        int result = x%10;
        while (x>10){
            x /=10;
            result *=10;
            result+=(x%10);
            }
        return result;
    }
    public static int convertDigits2(int x){
        int result = 0;
        while (x>0){
            int lastDigit = x%10;
            result *= 10;
            result += lastDigit;
            x /= 10;
        }
        return result;
    }

    public static void drawRectangle(int x, int y,int width, int height){
        // down in y.....(not x!!!!)
        for (int i = 0; i < y; i++) {
            System.out.println();
        }
        for (int i = 1; i < width; i++) {
            System.out.print("*");
        }
        System.out.println("*");
        for (int i = 0; i < height; i++) {
            System.out.print("*");
            for (int j = 2; j < width; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }

    }
    public static void printX(int x) {
        x = x%2==0 ? x : (x+=1);
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < x; j++) {
                System.out.print((i==j || i==x-j) ? "*" : " ");
            }
            System.out.println();
        }

    }


}
