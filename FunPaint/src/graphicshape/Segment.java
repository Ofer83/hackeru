package graphicshape;


import appcanvas.Border;

public class Segment {
    private Point p1;
    private Point p2;
    private double slop;
    private boolean slopCalaulated = false;
    /*homework:
    add constructor + clone add seterqgeter (no alias/pointer)
     add method length of segment
     add distFromLine ( of a point) that define
       - override the method equals and tostring
       - method return the slope of line (deltay/deltax)
     */
    public Segment(Point p1, Point p2) {
        if (p2.getXpos()>p1.getXpos()){
        setP1(p1);
        setP2(p2);
        }else {
            setP1(p2);
            setP2(p1);
        }
    }
    public Segment(Segment segment){
        this(segment.getP1(), segment.getP2());
    }
    public Point getP1() {
        return new Point(p1);
    }
    public Point getP2() {
        return new Point(p2);
    }
    public void setP1(Point p1) {
        this.p1 = new Point(p1);
        slopCalaulated = false;
    }
    public void setP2(Point p2) {
        this.p2 = new Point(p2);
        slopCalaulated = false;
    }
    double deltaX(Point p1, Point p2){
        return p2.getXpos() - p1.getXpos();
    }
    double deltaY(Point p1, Point p2){
        return p2.getYpos()- p1.getYpos();
    }
    double sumOfSquares(Point p1, Point p2){
        return deltaX(p1,p2)*deltaX(p1,p2) + deltaY(p1,p2)*deltaY(p1,p2);
    }
    public double slop(){
        if (!slopCalaulated)
           calcslop();
        return slop;
    }
    double calcslop(){
        if (deltaX(p1,p2) != 0){
        slop =  deltaY(p1,p2)/deltaX(p1,p2);
            slopCalaulated = true;
            return slop;
        }
        return 999999999;
    }
    double bpoint(){
        return p1.getYpos()-slop()*p1.getXpos();
    }

    @Override
    public String toString() {
        return "Line Y="+slop()+"X+"+bpoint() +" "+p1.toString()+"to"+p2.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)  //"this" is pointer of obj p ( if the same pointer >>> true)
            return true;
        if (obj instanceof Segment){
            Segment other = (Segment)obj;
            return this.p1.equals(other.p1) == this.p2.equals(other.p2); // must use equals to check value
        }
        return false;
    }
    //public double length(Point p1, Point p2){
    //    return p2.distanceFromPoint(p1);
    //}
    public double length(){
        return p2.distanceFromPoint(p1);
    }
    public double distanceFromPoint(Point c) {
        //    d= |(a*(cx)-cy+b)/Math.sqrt(a*a + 1)|
        double mone = (slop()*c.getXpos()-c.getYpos()+bpoint());
        double mechane = Math.sqrt(slop()*slop() + 1);
        return Math.abs(mone/mechane);
    }
    public boolean isPointOnSegment(Point p){
        Border border = getBorder();
        if(p.getXpos()>=border.leftBorder && p.getXpos()<=border.rightBorder &&
                p.getYpos()>=border.topBorder && p.getYpos()<=border.bottomBorder){
            double d = distanceFromPoint(p);
            return d<0.5;
        }
        return false;
    }
    public Border getBorder(){
        int leftBorder = p1.getXpos();
        int rightBorder = p2.getXpos();
        if(p1.getXpos() > p2.getXpos()){
            leftBorder = p2.getXpos();
            rightBorder = p1.getXpos();
        }
        int topBorder = p1.getYpos();
        int bottomBorder = p2.getYpos();
        if(p1.getYpos()>p2.getYpos()){
            topBorder = p2.getYpos();
            bottomBorder = p1.getYpos();
        }
        Border border = new Border();
        border.leftBorder = leftBorder;
        border.rightBorder = rightBorder;
        border.topBorder = topBorder;
        border.bottomBorder = bottomBorder;

        return border;
    }
    public void drawOnCanvas(boolean[][] canvas){
        if (canvas == null)
            return;
        Border border = getBorder();
        for (int i = border.topBorder; i <=border.bottomBorder ; i++) {
            for (int j = border.leftBorder; j <=border.rightBorder ; j++) {
                Point p = new Point(j,i);
                if (isPointOnSegment(p))
                    p.drawOnCanvas(canvas);
            }
        }

    }
}
