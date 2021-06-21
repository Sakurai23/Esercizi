package com.incrocio;

public class Semaforo implements Traffico {

    Semaforo() {
        verde();
    }

    public void verde() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mediator.semaforoGiallo();
        giallo();
    }

    public void giallo() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mediator.semaforoRosso();
        rosso();
    }

    public void rosso() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mediator.semaforoVerde();
        verde();
    }
}
