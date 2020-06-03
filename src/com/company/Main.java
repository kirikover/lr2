package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("print coordinate first point:");
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        double z1=in.nextDouble();
        point3d fpoint= new point3d(x1,y1,z1);
        System.out.print("print coordinate second point:");
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        double z2=in.nextDouble();
        point3d spoint= new point3d(x2,y2,z2);
        System.out.print("print coordinate third point:");
        double x3=in.nextDouble();
        double y3=in.nextDouble();
        double z3=in.nextDouble();
        point3d tpoint= new point3d(x3,y3,z3);
        double squa=ComputeArea(fpoint,spoint,tpoint);
        System.out.print("square:");
        System.out.print(squa);
    }
    public static double ComputeArea(point3d first, point3d second, point3d third){
        point3d need= new point3d();
         double one= first.distanceTo(second);

         double two= second.distanceTo(third);

         double three= third.distanceTo(first);

         double perimetr=0.5*(one+two+three);
        return(Math.sqrt(perimetr*(perimetr-one)*(perimetr-two)*(perimetr-three)));
    }
}
