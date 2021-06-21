package com.cntr.msc;

public class Chitarra implements Merce {

    public float getPrezzo() {
        return 100.0f;
    }

    public String getNome() {
        return "Chitarra";
    }

    public void print() {
        System.out.println("Nome merce: " + getNome() + "\tPrezzo: " + getPrezzo() + "€");
    }

}
