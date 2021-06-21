package com.panineria;

public class Client {
    public static void main(String[] args) {
        Panino paninoCrudoConWurstel = new ProsciuttoCrudo(new Wurstel(new PaninoSemplice()));

        paninoCrudoConWurstel.printIngredienti();
        System.out.println("Il prezzo del panino è: " + paninoCrudoConWurstel.getPrezzo());
    }
}
