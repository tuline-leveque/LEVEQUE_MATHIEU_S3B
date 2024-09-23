import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {

    private Identite identite;
    //private Formation formation;
    private Map<String, ArrayList<Float>> resultats;

    public Etudiant(String nip, String n, String p) {
        this.identite = new Identite(nip,n,p);
        this.resultats = new HashMap<>();
    }

    public void ajoutNote(String matiere, float note) {
        if ((note <= 20)&&(note >= 0)) {
            if (this.resultats.containsKey(matiere)) {
                this.resultats.get(matiere).add(note);
            } else {
                ArrayList<Float> notes = new ArrayList<>();
                notes.add(note);
            }
        }
    }

    public float calculMoyenne(String matiere) {
        float somme = 0;
        int nbnotes = 0;
        if (!this.resultats.containsKey(matiere)) {
            return -1;
        } else {
            for (float elt: this.resultats.get(matiere)) {
                nbnotes += 1;
                somme = somme + elt;
            }
            return somme/nbnotes;
        }
    }

    public float calculMoyenneGenerale() {
        float somme = 0;
        int nbnotes = 0;
        for (String matiere: this.resultats.keySet()) {
            for (float elt: this.resultats.get(matiere)) {
                somme = somme + elt;
                nbnotes += 1;
            }
        }
        if (nbnotes == 0) {
            return -1;
        } else {
            return somme / nbnotes;
        }
    }

}