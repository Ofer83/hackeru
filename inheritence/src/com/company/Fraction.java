package com.company;

/**
 * Created by hackeru on 6/22/2015.
 */
public class Fraction extends Number{
    private int mone;// numerator
    private int mechane = 1; // denuminator

    public Fraction(int mone, int mechane) {
            setMone(mone);
            setMechane(mechane);
    }
    public void setMechane(int mechane) {
        if (mechane != 0)
            this.mechane = mechane;
    }
    public void setMone(int mone) {
        this.mone = mone;
    }
    public int getMechane() {
        return mechane;
    }
    public int getMone() {
        return mone;
    }
    @Override
    public String toString(){
        return (mone + "/" + mechane);
    }

    @Override
    public int intValue() {
        return mone/mechane;
    }

    @Override
    public long longValue() {
        return mone/mechane;
    }

    @Override
    public float floatValue() {
        return (float)mone/(float)mechane; // one casting is ok
    }

    @Override
    public double doubleValue() {
        return mone/(double)mechane;
    }
}
