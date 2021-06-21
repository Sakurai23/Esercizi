package com.cntr.msc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StrumentiMusicali implements Merce {
    private List<Merce> listaStrumenti = new ArrayList<>();
    private String nome;

    StrumentiMusicali(String n) {
        nome = n;
    }

    public void add(Merce m) {
        listaStrumenti.add(m);
        System.out.println("Merce " + m.getNome() + " aggiunta con successo");
    }

    public void remove(Merce m) {
        listaStrumenti.remove(m);
        System.out.println("Rimozione " + m);
    }

    public float getPrezzo() {
        return listaStrumenti.stream().map(Merce::getPrezzo).reduce(0.0f, Float::sum);
    }

    public String getNome() {
        return listaStrumenti.stream().map(Merce::getNome).collect(Collectors.joining(", "));
    }

    public void print() {
        System.out.println("-------------- Lista Attuale Di " + this.nome + "--------------");
        for (Merce m : listaStrumenti)
            m.print();
        System.out.println("Prezzo totale: " + getPrezzo());
    }

}
