package graphicshape;

public class Square extends Rectangle {
    /*
    public Square(){
        super(10,10);  // allow only by using the father constructor
        //"super" is for call to father constructor
    }
    */
    public Square(int side){
        super(side,side);
    }
    //Seter
    public void setSide(int side){
        super.setWidth(side);
        super.setHeight(side);
    }
    //Geter
    public int getSide(){
        return getWidth();
    }

    //to solv the problem for call "Square.setWidth" and change only w and not h
    @Override
    public void setHeight(int h) {
        setSide(h);
    }
    @Override
    public void setWidth(int w) {
        setSide(w);
    }
}
