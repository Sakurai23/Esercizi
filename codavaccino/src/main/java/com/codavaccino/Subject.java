package com.codavaccino;

import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        System.out.println("Observer aggiunto in lista");

        observers.add(o);
    }

    public void detach(Observer o) {
        System.out.println("Observer rimosso");

        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers)
            o.update();
    }
}
