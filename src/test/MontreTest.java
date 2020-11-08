package test;

import code.Classes.Montre;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {
    public Montre montre;

    @Test
    void regler_montre(){
        montre = new Montre();
        montre.regler(23,59,59);
        assertEquals(montre.toString(), "23:59:59");
    }
}
