package graphicshape;

public abstract class Shape {  //"abstract" = can not create obj from this class!!!! no new chape = !!!!
    protected int color;

    public void fillColor(int newColor) {
        System.out.println("filling the shape with color :" + newColor);
    }

    public static double sumOfParamiter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].perimeter();
            System.out.println(shapes[i] + " " + shapes[i].perimeter());
        }
        return sum;
    }
    /*public double area(){
        return 0;
    }*/
    public abstract double area(); /// "abstract" -- must override this method!!!
    public abstract double perimeter();
}
