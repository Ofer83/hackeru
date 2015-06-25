package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        int[][] myArray2 = new int[3][5];
        myArray2[1][3] = 12;

        for (int j = 0; j < myArray2.length; j++){
            for (int k = 0; k < myArray2[j].length; k++) {
                System.out.print(myArray2[j][k] + ",");
            }
            System.out.println();
        }
        */
        boolean[][] canvas = new boolean[10][10];//new multi array and reset to false
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = false;
            }
        }
        int[] numbers = {2, 3, 4, 16, 7, 15, 23, 35,16 };
        System.out.println("indexOf=" + indexOf(numbers, 16));
        /*
        drawRectangle(canvas,2,3,7,7);
        drawRectangle(canvas,5,6,7,7);
        */

        drawLine(canvas,5,1,9,5);
        drawLine(canvas,5,1,1,5);
        drawLine(canvas,1,5,9,5);
        drawLine(canvas,1,3,9,3);
        drawLine(canvas,1,3,5,7);
        drawLine(canvas,9,3,5,7);

        //drawMgenDaviv(canvas,5,1,5);
        printcan(canvas);
        /*
        canvas[2][5] = true;
        canvas[4][6] = true;
        canvas[1][3] = true;
        */
        /*
        for (int j = 0; j < canvas.length; j++){
            for (int k = 0; k < canvas[j].length; k++) {
                if (j==k){
                    canvas[j][k]=true;
                }
               // System.out.print(canvas[j][k] ? "*" : " ");
            }
            //System.out.println();
        }
        */
    }
    public static int indexOf(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number)
                return i;
            }
        return -1;
    }
    /*
    public static void drawMgenDaviv2(boolean[][] canvas, int x, int y, int length) {
        if(length%2=0){
            length++;
        }
        drawLine(canvas,x,y,x+length-1,y+length-1);
        drawLine(canvas,x,y,x-length-1,y+length-1);
        drawLine(canvas,x-length-1,y+length-1,x+length-1,y+length-1);
        drawLine(canvas,1,3,9,3);
        drawLine(canvas,1,3,5,7);
        drawLine(canvas,9,3,5,7);
    }
    */
    public static void drawLine(boolean[][] canvas, int x, int y, int x1,int y1) {

        char direction = 0;
        if (x1==x) {
            for (int i = 0; i <= x1 - x; i++) { // draw Vertical line
                canvas[y+i][x] = true;
            }
        }
        else if(y1==y) {
            for (int i = 0; i <= x1 - x; i++) {  // draw Horizontal line
                canvas[y][x+i] = true;
            }
        }
        else if((y1>y) && (x1>x)) {
            for (int i = 0; i <= x1 - x; i++) {
                canvas[y + i][x + i] = true; // draw right2left line
            }
        }
        else if((y1>y) && (x1<x)) {
            for (int i = 0; i <= x - x1; i++) {
                canvas[y + i][x - i] = true; // draw left2right line
            }
        }
    }
    public static void drawRectangle(boolean[][] canvas, int x ,int y,int width,int height) {
        for (int i = 0; i <= width; i++) {
            canvas[y][x+i] = true; // draw top line
            canvas[y+height][x+i] = true; // draw bottom line
        }
        for (int i = 0; i < height; i++) {
            canvas[y+i][x] = true; // draw left line
            canvas[y+i][x+width] = true; //draw right line
        }
    }
    public static void printcan(boolean[][] canvas){
        for (int i = 0; i < canvas.length; i++){
            for (int j = 0; j < canvas[i].length; j++) {
               System.out.print(canvas[i][j] ? "x " : "  ");
            }
            System.out.println();
        }
    }
}
