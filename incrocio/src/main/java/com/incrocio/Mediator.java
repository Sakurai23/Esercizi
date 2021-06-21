package com.incrocio;

public interface Mediator {
    public void accendiSemaforo();

    public void semaforoVerde();

    public void semaforoGiallo();

    public void semaforoRosso();

    public void addVeicolo(Veicolo v);

    public void removeVeicolo(Veicolo v);
}
