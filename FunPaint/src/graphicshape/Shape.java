package graphicshape;

import java.time.Instant;

public class Shape {
    protected int color;

    public void fillColor(int newColor) {
        System.out.println("filling the shape with color :" + newColor);
    }

    public double paramiter() {
        return 0;
    }

    public static double sumOfParamiter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].paramiter();
            System.out.println(shapes[i] + " " + shapes[i].paramiter());
        }
        return sum;
    }
    public double area(){
        return 0;
    }
}
