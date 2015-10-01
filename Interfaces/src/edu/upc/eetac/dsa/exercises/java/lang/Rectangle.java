package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Aitor on 26/9/15.
 */
public class Rectangle extends Shape {

    private int a,h;
    private double area;

    public Rectangle(int a, int h){
        super("rectangle");
        this.a=a;
        this.h=h;
    }

    @Override
    public double area(){
        area=a*h;
        return area;
    }
}
