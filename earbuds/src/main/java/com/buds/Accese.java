package com.buds;

public class Accese implements StatoEarbuds {

    @Override
    public StatoEarbuds accendi() {
        System.out.println("EarBuds già accese");
        return this;
    }

    @Override
    public StatoEarbuds spegni() {
        System.out.println("EarBuds spente con successo");
        return new Spente();
    }

    @Override
    public StatoEarbuds connetti() {
        System.out.println("EarBuds connesse con successo");
        return new Connesse();
    }

    @Override
    public StatoEarbuds disconnetti() {
        System.out.println("EarBuds ancora non connesse");
        return this;
    }

}
