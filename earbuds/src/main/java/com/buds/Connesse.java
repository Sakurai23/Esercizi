package com.buds;

public class Connesse implements StatoEarbuds {

    @Override
    public StatoEarbuds accendi() {
        System.out.println("EarBuds già accesse");
        return this;
    }

    @Override
    public StatoEarbuds spegni() {
        System.out.println("EarBuds spente con successo");
        return new Spente();
    }

    @Override
    public StatoEarbuds connetti() {
        System.out.println("EarBuds già connesse");
        return this;
    }

    @Override
    public StatoEarbuds disconnetti() {
        System.out.println("EarBuds disconnesse con successo");
        return new Accese();
    }

}
