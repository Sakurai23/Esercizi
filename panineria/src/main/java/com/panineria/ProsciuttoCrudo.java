package com.panineria;

public class ProsciuttoCrudo extends IngredientiDecorator {

    ProsciuttoCrudo(Panino nuovoPanino) {
        super(nuovoPanino);

        System.out.println("Aggiunta prosciutto crudo");
    }

    public float getPrezzo() {
        return super.getPrezzo() + 1.25f;
    }

    public void printIngredienti() {
        super.printIngredienti();
        System.out.println("- prosciutto crudo");
    }

}
