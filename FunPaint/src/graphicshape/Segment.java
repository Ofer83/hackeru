package graphicshape;

/**
 * Created by Hackeru on 6/25/2015.
 */
public class Segment {
    private Point p1;
    private Point p2;
    /*homework:
    add constractor + clone add seterqgeter (no alias/pointer)
     add method length of segment
     add distFromLine ( of a point) that define
       - override the method equals and tostring
       - method return the slope of line (deltay/deltax)
     */
    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Segment(Segment segment){
        this(segment.getP1(),segment.getP2());
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public void setP1(Point p1) {
        //this.p1 = p1;
        this.p1 = new Point(p1);
    }
    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }
}
