package appcanvas;

import graphicshape.*;


public class Canvas {
    private static boolean[][] canvas = new boolean[20][60];//25 line 50 colom
    public static void clearCanvas(){
        for (int i = 0; i <canvas.length ; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = false;
            }
        }
    }
    public static void drewCanvas(){
        for (int i = 0; i <canvas.length ; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] ? "*" : " ");;
            }
            System.out.println();
        }
    }

    /*
    public static void main(String[] args) {
        System.out.println("main is in canvas package");
    }
    */
    public static void main(String[] args) {
        clearCanvas();
        Point p1 = new Point(1,1);
        Point p2 = new Point(16,1);
        Point p3 = new Point(8,20);
        Triangle triangle = new Triangle(p1,p2,p3);
        System.out.println(Triangle.howManyTriangle);
        triangle.drawOnCanvas(canvas);
        //Segment segment = new Segment(p,p1);
        //segment.drawOnCanvas(canvas);
        drewCanvas();

        Point A = new Point(1,2);
        Point B = new Point(2,4);
        Point C = new Point(1,6);
        Segment line = new Segment(A,B);
        System.out.print("point A=" + A + "  point B=" + B + "  point C=" + C + "   ");
        System.out.print(line + "    ");

        System.out.println("length = "+line.length());
        System.out.println("distFromLine ="+line.distanceFromPoint(C));

        long sumTime = 0;
        int interval = 20;
        for (int i = 0; i < interval; i++) {   // check how time take to run the function!!!
            long start = System.nanoTime();
            A.setyPos(i);
            A.distanceFromPoint(B);
            long end = System.nanoTime();
            sumTime += end-start;
        }
        long delay = sumTime/interval;
        System.out.println("Run time = " + delay);

        Point q = new Point(2,3);
        Point q1 = new Point(q); //we have the cloneqcopy constractor
        q1.setxPos(100);
        Circlep cx = new Circlep(q1,18);
        System.out.println(cx);

        Circlep cp = new Circlep(50);
        Circlep cp2 = new Circlep(50);

        /*if (cp.equals(cp2)){  // we override the function "equals"!!!!! "this" refer to p. "obj" refer to p2
            System.out.println("cp and cp2 are the same");
        }else {
            System.out.println("cp and cp2 are the different");
        }*/
        Point3D p3d = new Point3D(5,3,1);
        //Point3D p2 = new Point3D(5,3,1);
        //if (p == p2) {   // == refer to the pointers and not the value
        //if (p.equals(p2)){  // we override the function "equals"!!!!! "this" refer to p. "obj" refer to p2
        //    System.out.println("p and p2 are the same");
        //}else {
        //    System.out.println("p and p2 are the different");
        //}
        /*
        Point p = new Point(5,3);
        Point p2 = new Point(5,3);
            //if (p == p2) {   // == refer to the pointers and not the value
            if (p.equals(p2)){  // we override the function "equals"!!!!! "this" refer to p. "obj" refer to p2
                System.out.println("p and p2 are the same");
            }else {
                System.out.println("p and p2 are the different");
            }
        */
        //System.out.println(p);

        System.out.println(p3d);

        // write your code here
        Circle c = new Circle(10,20,30); // hear we operate default function Circle()...
        Circle c2 = new Circle(11);
        //c.radius = 30; // overwrite default
        //c2.xPos = 11;
        //System.out.print(c);
        //c.printYourSelf();   no need for this row
        //c2.printYourSelf();
        //System.out.print(c2);
        Circle c3 = c2; // new pointer c3 to the same obj....
        //c3.xPos++; // ++ from 11 to 12.....c3 point to the same obj as c2
        //System.out.println("c2 xpos = " + c2.getXPos());
        /*
        c.fillColor(123);
        byte red = 60;
        byte green = 28;
        byte blue = -30;
        c.fillColor(red,green,blue); // operate the function with the correct parameters
        Shape s = new Shape();
        s.fillColor(444);
        */
        Shape s2 = new Circle(); //pointer from shape type can point on circle (son of shape)
        //s2.fillColor(2345);
        //s2.area metoda not in shape only in circle
        Circle c4 = (Circle)s2; //casting action... change s2 to be circle (not shape)
        c4.area();

        s2 = new Rectangle(5,7); //we lost the position of "new Circle"!!!!!!
        //Circle c5 = (Circle) s2; // error - s2 is rectangle not a circle....
        /*
        if (s2 instanceof Circle){
            Circle c5 = (Circle) s2; //only then can cast....
        }
        else {
            System.out.println(",,,,,,,,,,,,,,,,,,,,,s2 is not a circle");
        }
        */
        //double theArea = c.area();
        /*System.out.println("The erea = " + c.area());
        c.printYourSelf();
        System.out.println(c); //print c.toString but @override....to hello*/
        //System.out.println(Circle.calcArea(20));

        /*Shape myShape = new Shape(); // pointer from type "shape"
        myShape.fillColor(123);        //metoda run in shape class
        Circle myCircle = new Circle(); // pointer from type "circle"
        myCircle.fillColor(123);        //metoda run in circle class
        */
        Shape myShape = new Circle();    // pointer frome type "shape"
        //myShape.fillColor(123);         //metoda run in circle class becous "myshape is type of circle!!!!

        Shape[] myShapes = new Shape[3]; // Array of shapes
        //myShapes[0] = new Shape();       // first item general
        myShapes[1] = new Circle();      // second item is Circle - default in the class
        Rectangle rect = new Rectangle(15,25); //defined Rect 15*25 in the 3rd item
        //rect.setWidth(15);
        //rect.setHeight(25);
        myShapes[2] = rect;
        //System.out.println("the sum of parmiter = " + Shape.sumOfParamiter(myShapes));

     /*   int x=1;
        x=stam(x);
        System.out.println(x);*/
    }
    /*public static int stam(int z){
        System.out.print("stam x = ");
        return ++z;
    }*/
    public static double sumOfArea(Shape[] shapes){
        double sum = 0;
        for (Shape s : shapes)
            sum += s.area();
        return sum;
    }





}
