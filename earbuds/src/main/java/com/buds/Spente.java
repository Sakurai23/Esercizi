package com.buds;

public class Spente implements StatoEarbuds {

    @Override
    public StatoEarbuds accendi() {
        System.out.println("EarBuds accese con successo!");
        return new Accese();
    }

    @Override
    public StatoEarbuds spegni() {
        System.out.println("EarBuds già spente");
        return this;
    }

    @Override
    public StatoEarbuds connetti() {
        System.out.println("Earbuds spente");
        return this;
    }

    @Override
    public StatoEarbuds disconnetti() {
        System.out.println("Earbuds spente");
        return this;
    }

}
