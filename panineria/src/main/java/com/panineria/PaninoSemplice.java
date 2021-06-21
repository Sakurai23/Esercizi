package com.panineria;

public class PaninoSemplice implements Panino {

    public float getPrezzo() {
        return 2.0f;
    }

    public void printIngredienti() {
        System.out.println("Ingredienti del panino: ");
        System.out.println("- Pane");
    }

}
