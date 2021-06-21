package com.cntr.msc;

public class Pianoforte implements Merce {

    public float getPrezzo() {
        return 380.0f;
    }

    public String getNome() {
        return "Pianoforte";
    }

    public void print() {
        System.out.println("Nome merce: " + getNome() + "\tPrezzo: " + getPrezzo() + "€");
    }

}
