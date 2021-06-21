package com.panineria;

public class Wurstel extends IngredientiDecorator {

    Wurstel(Panino nuovoPanino) {
        super(nuovoPanino);

        System.out.println("Aggiunta wurstel");
    }

    public float getPrezzo() {
        return super.getPrezzo() + 1.0f;
    }

    public void printIngredienti() {
        super.printIngredienti();
        System.out.println("- wurstel");
    }

}
