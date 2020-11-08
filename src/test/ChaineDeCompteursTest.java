package test;

import code.Classes.ChaineDeCompteurs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChaineDeCompteursTest {
    public ChaineDeCompteurs chaineDeCompteurs;

    @Test
    void incrementer_de_un(){
        chaineDeCompteurs = new ChaineDeCompteurs(3,
                new int[]{0, 0, 0},
                new int[]{24, 60, 60},
                new int[]{1, 1, 1}
                );
        chaineDeCompteurs.incrementer();
        assertEquals(chaineDeCompteurs.toString(), "0:0:1");
    }

    @Test
    void raz_chaine(){
        chaineDeCompteurs = new ChaineDeCompteurs(3,
                new int[]{0, 0, 0},
                new int[]{24, 60, 60},
                new int[]{1, 1, 1}
        );
        for(int i=0; i<3665; i++)
            chaineDeCompteurs.incrementer();
        assertEquals(chaineDeCompteurs.toString(), "1:1:5");
        chaineDeCompteurs.raz();
        assertEquals(chaineDeCompteurs.toString(), "0:0:0");
    }
}
