package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Aitor on 26/9/15.
 */

public class Main {
    public static void main(String[] args) {
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5, "Pino");

        for (Tree t : arboles)
            System.out.println(t);
    }
}

