package com.company;

public class point3d extends point2d {

    private double zCoord;
    public point3d(double x,double y, double z){
        super(x,y);
        zCoord=z;
    }
    public point3d(){
        this(0.0,0.0,0.0);
    }

    public boolean equals(point3d esa){
        if (super.equals(esa) && this.zCoord==esa.zCoord){
            return true;
        }
        else{ return false;}
    }
    public double getzCoord() {
        return zCoord;
    }
    public void setz(double val) {
        zCoord = val;
    }
    public Double distanceTo(point3d A)
    {
        double d = Math.sqrt(Math.pow((this.xCoord - A.getxCoord()), 2) + Math.pow((this.yCoord - A.getyCoord()),2) + Math.pow(this.zCoord - A.getzCoord(), 2));
        d = d * 100;
        int i = (int) Math.round(d);
        d = (double)i / 100;
        return (d);
    }

}
