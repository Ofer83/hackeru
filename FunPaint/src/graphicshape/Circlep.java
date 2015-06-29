package graphicshape;

// inherit from Shape
public class Circlep extends Shape {

    private Point center;
    private int radius; //default values
    // function for default values....???? same name as the department..no need for int.void..etc
    final static int DF_XPOS = 20; // static for one to all Obj in the department
    final static int DF_YPOS = 10;
    final static int DF_RADIUS = 30; // no option to change the value......final!!!!

    public Circlep(){
        this(DF_RADIUS);
    }
    public Circlep(Point p , int r){ // constractor overload
        setCenter(p);
        setRadius(r);
    }
    public Circlep(Circlep circlep){
        this(circlep.getCenter(),circlep.getRadius()); //must change the seter for the center.....
    }

    public Circlep(Point p){
        this(p, DF_RADIUS);
    }
    public Circlep(int r){
        this(new Point(DF_XPOS, DF_YPOS),r);
    }


    public void setCenter(Point center) {
        //this.center = center;             // copy pointer
        this.center = new Point(center);    // copy value
    }

    public Point getCenter() {
        //return center;                // send pointer
        return new Point(center);       // send value
    }
    public int getRadius() {
        return radius;
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
        System.out.println("center = " + center.toString() + " radius = " + radius);
    }
    @Override // ????? ????? ????? ?? ??????......
    public String toString() {
        //return super.toString();
        return "Circle center = (" + center.toString() + ") and radius = " + radius +"    ";
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)  //"this" is pointer of obj p ( if the same pointer >>> true)
            return true;
        if (obj instanceof Circlep){
            Circlep other = (Circlep)obj;
            return this.center.equals(other.center) && this.radius == other.radius; // must use equals to check value
        }
        return false;
        }
}