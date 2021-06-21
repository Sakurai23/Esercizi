package com.panineria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.*;

public class TestPanino {
    Panino panino;

    @Test
    public void whenPaninoCrudoCosta() {
        panino = new ProsciuttoCrudo(new PaninoSemplice());
        float prezzo = panino.getPrezzo();
        assertEquals(3.25f, prezzo, 0.0f
        );
    }
}
