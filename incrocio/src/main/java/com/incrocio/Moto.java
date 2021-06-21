package com.incrocio;

public class Moto extends Veicolo {
    String nome = "Moto";

    Moto(int i) {
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
