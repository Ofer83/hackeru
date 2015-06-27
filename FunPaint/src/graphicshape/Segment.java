package graphicshape;

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
        if (p2.getxPos()>p1.getxPos()){
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
        //this.p1 = p1;
        this.p1 = new Point(p1);
    }
    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }
    double deltaX(Point p1, Point p2){
        return p2.getxPos() - p1.getxPos();
    }
    double deltaY(Point p1, Point p2){
        return p2.getyPos()- p1.getyPos();
    }
    double sumOfSquares(Point p1, Point p2){
        return deltaX(p1,p2)*deltaX(p1,p2) + deltaY(p1,p2)*deltaY(p1,p2);
    }
    double slop(Point p1, Point p2){
        if (deltaX(p1,p2) != 0){
        return deltaY(p1,p2)/deltaX(p1,p2);
        }
        return 999999999;
    }
    double bpoint(Point p1, Point p2){
        return p1.getyPos()-slop(p1,p2)*p1.getxPos();
    }

    @Override
    public String toString() {
        return "Line Y="+slop(p1,p2)+"X+"+bpoint(p1,p2);
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
    public double lengthOfSegment(Point p1, Point p2){
        return p2.distanceFromPoint(p1);
    }
    public double distFromLine(Segment line, Point c) {
        //    d= |(a*(cx)-cy+b)/Math.sqrt(a*a + 1)|
        double mone = (line.slop(p1,p2)*c.getxPos()-c.getyPos()+line.bpoint(p1,p2));
        double mechane = Math.sqrt(line.slop(p1,p2)*line.slop(p1,p2) + 1);
        return Math.abs(mone/mechane);
    }
}
