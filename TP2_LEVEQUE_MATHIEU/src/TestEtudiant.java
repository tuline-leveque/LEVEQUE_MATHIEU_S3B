import org.junit.jupiter.api.Test;

public class TestEtudiant {

    Etudiant etu = new Etudiant("156482","Bob","Lemon");

    @Test
    public void testEtudiant_ajout_note_matiere_inexistante() throws Exception{
        etu.ajoutNote("crypto",12.5);
        if(etu.calculMoyenne("crypto") != 12.5){
            throw new Exception("Hey faut avoir 12.5 là");
        }
    }

    @Test
    public void testEtudiant_ajout_note_matiere_existante() throws Exception{
        etu.ajoutNote("crypto",12.5);
        etu.ajoutNote("crypto",18.5);
        if(etu.calculMoyenne("crypto") != 15.5){
            throw new Exception("Hey faut avoir 15.5 là");
        }
    }

    @Test
    public void testEtudiant_calcul_moyenne_generale() throws Exception{
        etu.ajoutNote("crypto",12.5);
        etu.ajoutNote("criptaugrafi",18.5);
        if(etu.calculMoyenneGenerale() != 15.5){
            throw new Exception("Hey faut avoir 15.5 là");
        }
    }

}
