package com.codavaccino;

public class DisplayNumero extends Subject {
    private int numero;
    private static DisplayNumero display;

    private DisplayNumero() {
        numero = 0;
    }

    public static DisplayNumero getIstance() {
        if (display == null)
            display = new DisplayNumero();
        return display;
    }

    public void aumentaNumero() {
        numero = (numero + 1) % 100;
        stampaNumero();
        notifyObservers();
    }

    private void stampaNumero() {
        System.out.println("Numero " + getNumero());
    }

    public int getNumero() {
        return numero;
    }
}
