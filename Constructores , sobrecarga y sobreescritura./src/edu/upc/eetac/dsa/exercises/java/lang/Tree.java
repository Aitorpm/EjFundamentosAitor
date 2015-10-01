package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Aitor on 26/9/15.
 */

public class Tree {
    //variables
    private int altura;
    private String tipo;


    //constructores
    public Tree(){}

    public Tree(int altura){this.altura=altura;}

    public Tree(String tipo){this(0,tipo);}

    public Tree(int altura, String tipo){
        this.altura=altura;
        this.tipo=tipo;
    }

    @Override //pq?¿ Override es para sobreescribir pero nose pq hay q sobreescribir
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if(tipo==null) sb.append("árbol");
        else sb.append(tipo);
        if(altura!=0) sb.append(" de "+altura+ " metros");
        return sb.toString();
    }
}
