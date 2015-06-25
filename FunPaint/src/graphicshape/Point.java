package graphicshape;

public class Point{
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        setxPos(xPos);
        setyPos(yPos);
    }
    public Point(Point point){
        this(point.getxPos(),point.getyPos()); // clone/// for copy values (Point q1 = new Point(q))
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;

    }

    public void setxPos(int xPos) {

        this.xPos = xPos;
    }


    public int getyPos() {

        return yPos;
    }

    public int getxPos() {

        return xPos;
    }

    /*
        public Point(){
            super.setRadius(0);
        }
        //to solv the problem for call "Square.setWidth" and change only w and not h

        @Override
        public void setRadius(int radius) {
            super.setRadius(0);
        }
        */
    @Override
    public String toString() {
        return ("(" + componentsBycoma() + ")" );
    }
    public double distanceFromOrigin(){
        return distanceFromPoint(0,0);
    }

    public double distanceFromPoint(int x, int y){
        return Math.sqrt(sumOfSquares(x,y));
    }
    public double distanceFromPoint(Point p){
        return distanceFromPoint(p.getxPos(),p.getyPos());
    }

    protected double sumOfSquares(int x, int y){
        int deltaX = x-xPos;
        int deltaY = y-yPos;
        return deltaX*deltaX + deltaY*deltaY;
    }

    protected String componentsBycoma(){
        return xPos + "," + yPos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)  //"this" is pointer of obj p ( if the same pointer >>> true)
            return true;
        if (obj instanceof Point){
            Point other = (Point)obj;
            return this.xPos == other.xPos && this.yPos == other.yPos;
        }
        return false;
    }
}
