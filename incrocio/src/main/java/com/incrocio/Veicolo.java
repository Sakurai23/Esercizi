package com.incrocio;

public abstract class Veicolo implements Traffico {
    int id;

    Veicolo(int i) {
        id = i;
    }

    public void ferma() {
        System.out.println("Veicolo " + id + " fermato");
    }

    public void parti() {
        System.out.println("Veicolo " + id + " partito");
    }
}
