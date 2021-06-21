package com.buds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEarbuds {
    @Test
    public void quandoSonoSpenteSeOneClickAlloraAccesse() {
        StatoEarbuds e = new Spente();
        e = e.accendi();
        assertEquals(Accese.class, e.getClass());
    }
}
