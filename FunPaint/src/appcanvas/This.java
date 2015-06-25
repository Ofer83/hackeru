package appcanvas;

public class This {
    String name;
    int x;
    public This(String name,int x){
        System.out.println("in constractor " + name);
        this.name = name; //refer to name outside the function and in this class
        //this.x=8; // no need for this!!!!
        this.x=8;
    }
}
