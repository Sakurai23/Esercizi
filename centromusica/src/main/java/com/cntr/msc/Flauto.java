package com.cntr.msc;

public class Flauto implements Merce {

    public float getPrezzo() {
        return 69.0f;
    }

    public String getNome() {
        return "Flauto";
    }

    public void print() {
        System.out.println("Nome merce: " + getNome() + "\tPrezzo: " + getPrezzo() + "€");
    }

}
