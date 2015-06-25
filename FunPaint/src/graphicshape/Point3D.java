package graphicshape;

public class Point3D extends Point {
    private int zPos;

    public Point3D(int x, int y, int z) {
        super(x,y);
        setzPos(z);
    }
    public void setzPos(int z) {
        this.zPos = z;
    }
    public int getzPos() {
        return zPos;
    }

    @Override
    public String toString() {
        return ("(" + componentsBycoma() + ")" );
    }

    @Override
    protected String componentsBycoma() {
        return super.componentsBycoma() + "," + zPos;
    }
    protected double sumOfSquares(int x, int y, int z){
        int deltaZ = this.zPos-z;
        return sumOfSquares(x,y) + deltaZ*deltaZ;
    }
    public double distanceFromPoint(int x, int y, int z){
        return Math.sqrt(sumOfSquares(x,y,z));
    }

    @Override
    public double distanceFromPoint(Point p) {  //we dont know if the point is 2 or 3D?
        if (p instanceof Point3D){
            Point3D theOtherPoint = (Point3D)p; //casting to 3D
            return distanceFromPoint(theOtherPoint.getxPos(),theOtherPoint.getyPos(),theOtherPoint.getzPos());
        }else {
            return distanceFromPoint(p.getxPos(),p.getyPos(),0);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) && obj instanceof Point3D){
            Point3D other = (Point3D)obj;
            return this.zPos == other.zPos;
        }
        return false;
    }
    /*@Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj instanceof Point3D){
            Point3D other = (Point3D)obj;
            return this.equals(other) && this.zPos == other.zPos ;
        }
        return false;
    }*/
}
