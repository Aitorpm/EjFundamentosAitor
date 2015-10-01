package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Aitor on 26/9/15.
 */
public class Circle extends Shape {

    private double radius, area;

    public Circle(double radius){
        super("circle");
        this.radius=radius;
    }

    @Override
    public double area(){
        area= Math.PI*radius*radius;
        return area;
    }

}
