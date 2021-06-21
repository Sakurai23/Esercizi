package com.codavaccino;

public class Persona implements Observer {
    private DisplayNumero display;
    private String nome;
    private String cognome;
    private int turno;
    private int eta;

    Persona(String n, String c, int e, int t) {
        this.nome = n;
        this.cognome = c;
        this.eta = e;
        this.turno = t;
        display = DisplayNumero.getIstance();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getEta() {
        return this.eta;
    }

    @Override
    public void update() {
        if (controllaTurno()) {
            entra();
        }
    }

    private boolean controllaTurno() {
        return turno == display.getNumero();
    }

    private void entra() {
        System.out.println("La persona con il numero " + this.turno + " è entrata");
    }

}
