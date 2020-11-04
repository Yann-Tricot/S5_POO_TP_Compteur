package test;

import code.Compteur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CompteurTest {
    public Compteur c;

    @Test
    void incrementer_de_un() {
        c = new Compteur();
        c.incrementer();
        assertEquals(c.getValeur(),c.getPas());
    }

    @Test
    void incrementer_sup_borne_max(){
        c = new Compteur(0,1,1);
        c.incrementer();
        assertEquals(c.getValeur(),c.getMin());
    }

    @Test
    void raz() {
        c = new Compteur();
        c.incrementer();
        c.incrementer();
        c.raz();
        assertEquals(c.getValeur(),c.getMin());
    }

    @Test
    void testToString() {
        c = new Compteur(10,5,0);
        assertEquals(c.toString(),"10");

    }
}