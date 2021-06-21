package com.panineria;

public class IngredientiDecorator implements Panino {
    Panino panino;

    IngredientiDecorator(Panino nuovoPanino) {
        panino = nuovoPanino;
    }

    public float getPrezzo() {
        return panino.getPrezzo();
    }

    public void printIngredienti() {
        panino.printIngredienti();
    }

}
