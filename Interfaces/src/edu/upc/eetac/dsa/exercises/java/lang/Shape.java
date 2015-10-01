package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Aitor on 26/9/15.
 */
public abstract class Shape implements InterfaceShape {

    protected String nombre;

    public Shape(String nombre){this.nombre=nombre;}

    public String toString(){return "I'm a " + nombre ;}


}
