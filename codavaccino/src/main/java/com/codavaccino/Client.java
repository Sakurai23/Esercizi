package com.codavaccino;

import java.util.function.Function;
import java.util.function.Supplier;

public class Client {
    public static void main(String[] args) {
        Persona marco = new Persona("Marco", "Li Pira", 20, 10);
        Persona carmelo = new Persona("Carmelo", "Cannavò", 20, 15);
        DisplayNumero display = DisplayNumero.getIstance();
        display.attach(marco);
        display.attach(carmelo);
        for (int i = 0; i < 130; i++) {
            display.aumentaNumero();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Function<Persona,Integer> etaPersona = p -> p.getEta();
    }
}
