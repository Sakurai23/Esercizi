package com.incrocio;

import java.util.LinkedList;
import java.util.List;

public class Incrocio implements Mediator {

    Semaforo sm;
    int millisecondi;

    List<Veicolo> veicoli = new LinkedList<>();

    @Override
    public void accendiSemaforo() {
        if (sm == null)
            sm = new Semaforo();
        semaforoVerde();
    }

    @Override
    public void semaforoVerde() {
        System.out.println("----------------------------------");
        System.out.println("----------Semaforo verde----------");
        System.out.println("----------------------------------");
        millisecondi = 150;
    }

    @Override
    public void semaforoGiallo() {
        System.out.println("----------------------------------");
        System.out.println("----------Semaforo giallo---------");
        System.out.println("----------------------------------");
        millisecondi = 300;
    }

    @Override
    public void semaforoRosso() {
        System.out.println("----------------------------------");
        System.out.println("----------Semaforo rosso----------");
        System.out.println("----------------------------------");
    }

    @Override
    public void addVeicolo(Veicolo v) {
        System.out.println("Veicolo arrivato nell'incrocio");
        veicoli.add(v);
    }

    @Override
    public void removeVeicolo(Veicolo v) {
        System.out.println("Il veicolo " + v.id + " ha lasciato l'incrocio");
        veicoli.remove(v);
    }

}
