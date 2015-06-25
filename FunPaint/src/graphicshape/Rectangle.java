package graphicshape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    static int dfwidth = 12;
    final static int dfheight =30;
    /*
    //   **** must give width and height when making new Rectangle...****
    public Rectangle (){
        this(dfwidth,dfheight);
    }
    */
    public Rectangle(int w){
        this(w, dfheight);
    }

    public Rectangle(int w, int h){
        setWidth(w);
        setHeight(h);
    }
    public Rectangle(Rectangle rectangle){
        this(rectangle.getWidth(),rectangle.getHeight());
    }

    //"Geter" function (Ctrl+N)
    public int getWidth(){   //function to revil Width that privet
        return width;
    }
    //"Seter" function
    public void setWidth(int w){   //function to set Width that privet
        this.width = (w > 0 ? w : 0);
    }
    //"Geter" function
    public int getHeight(){   //function to revil Width that privet
        return height;
    }
    //"Seter" function
    public void setHeight(int h){   //function to set Width that privet
        this.height = (h > 0 ? h : 0);
    }

    @Override
    public double paramiter() {
        return 2*(width + height);
    }
    @Override // ????? ????? ????? ?? ??????......
    public String toString() {

        //return super.toString();
        return "Rectangle width = ("+width+") and height = " + height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
