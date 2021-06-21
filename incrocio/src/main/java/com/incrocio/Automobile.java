package com.incrocio;

public class Automobile extends Veicolo {
    String nome = "Automobile";

    Automobile(int i) {
        super(i);
    }

    @Override
    public void ferma() {
        System.out.print(nome + " - ");
        super.ferma();
    }

    @Override
    public void parti() {
        System.out.print(nome + " - ");
        super.parti();
    }
}
