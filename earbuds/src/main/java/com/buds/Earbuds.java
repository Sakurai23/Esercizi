package com.buds;

public class Earbuds {
    StatoEarbuds earbuds = new Spente();

    public void oneClick() {
        earbuds.accendi();
    }

    public void doubleClick() {
        earbuds.connetti();
    }

    public void twoSecondsClick() {
        earbuds.disconnetti();
    }

    public void fourSecondsClick() {
        earbuds.spegni();
    }
}
