import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormationTest {

    @Test
    public void testAjoutMatiere() {
        Formation f = new Formation("Info");

        //methode testee
        f.adjMatiere("Maths", 12.0);

        //test
        assertEquals("Maths: 12.0\n",f.toString());
    }

    @Test
    public void testSuppressionMatiere() {
        Formation f = new Formation("Info");
        f.adjMatiere("Maths", 12.0);
        f.adjMatiere("QDev", 25.0);

        //methode testee
        f.supprimerMatiere("QDev");

        //test
        assertEquals("Maths: 12.0\n",f.toString());
    }

    @Test
    public void testSuppressionMatiereInexistante() {
        Formation f = new Formation("Info");
        f.adjMatiere("Maths", 12.0);
        f.adjMatiere("QDev", 25.0);

        //methode testee
        f.supprimerMatiere("Bob");

        //test
        assertEquals("Maths: 12.0\nQDev: 25.0\n",f.toString());
    }

    @Test
    public void testGetcoeffExiste() {
        Formation f = new Formation("Info");
        f.adjMatiere("Maths", 12.0);
        f.adjMatiere("QDev", 25.0);

        //methode testee
        double resultat = f.getCoeff("Maths");

        //test
        assertEquals(12.0,resultat);
    }

    @Test
    public void testGetcoeffinexistant() {
        Formation f = new Formation("Info");
        f.adjMatiere("Maths", 12.0);
        f.adjMatiere("QDev", 25.0);

        //methode testee
        double resultat = f.getCoeff("Bob");

        //test
        assertEquals(0.0,resultat);
    }

}