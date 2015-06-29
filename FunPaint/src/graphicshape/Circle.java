package graphicshape;

    // inherit from Shape
    public class Circle extends Shape {

        private int xPos;
        private int yPos;
        private int radius; //default values
        // function for default values....???? same name as the department..no need for int.void..etc
        final static int dfXpos = 20; // static for one to all Obj in the department
        final static int dfYpos = 10;
        final static int dfRadius = 30; // no option to change the value......final!!!!
        public Circle() {   // constractor overload
            this(dfXpos,dfYpos,dfRadius);
        }
        public Circle(int x) {   // constractor overload
            this(x,dfYpos,dfRadius);
        }
        public Circle(int x,int y) {   // constractor overload
            this(x,y,dfRadius);
        }
        public Circle(int x, int y, int r){ // constractor overload
            setxPos(x);
            setyPos(y);
            setRadius(r);
        }

        public int getxPos() {
            return xPos;
        }

        public int getyPos() {
            return yPos;
        }

        public int getRadius() {
            return radius;
        }

        public void setxPos(int xPos) {
            this.xPos = xPos;
        }

        public void setyPos(int yPos) {
            this.yPos = yPos;
        }

        public void setRadius(int radius) {
            if (radius>0)
                this.radius = radius;
        } // else the value of radius remain what was...

        //new function......
        @Override
        public double area() {
            //return 3.14 * radius*radius;
            return Math.PI * radius * radius;
        }
        //    public static double calcArea(int radius){     //metoda static...must get param....
        //        return Math.PI * radius * radius;
        //    }
        public void printYourSelf() {
            System.out.println("xPos = " + xPos + " radius = " + radius);
        }
        @Override // ????? ????? ????? ?? ??????......
        public String toString() {
            //return super.toString();
            return "Circle center = (" + xPos + "," + yPos + ") and radius = " + radius +"    ";
        }
        @Override
        public void fillColor(int newColor) {
            System.out.println("filling the circle- with color :" + newColor);
        }
        public void fillColor (byte red, byte green, byte blue){ //same name *overload*
            System.out.println("filling the circle- with color RGB :" + red + green + blue);

        }
        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        /**
         * Created by Hackeru on 6/29/2015.
         */

    }