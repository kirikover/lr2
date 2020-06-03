package com.company;

public class point2d {
    protected double xCoord ;
    protected double yCoord;
    public point2d(double x, double y){
        xCoord=x;
        yCoord=y;
    }
    public point2d(){
        this(0,0);
    }

    public double getxCoord() {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setx(double val) {
        xCoord = val;
    }

    public void sety(double val) {
        yCoord = val;
    }

    public boolean equals(point2d edd) {
        if (this.xCoord == edd.xCoord && this.yCoord == edd.yCoord) {
            return true;
        }
        else {return false;}
    }
}
