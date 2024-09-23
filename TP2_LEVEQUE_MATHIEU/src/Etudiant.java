import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {

    private Identite identite;
    //private Formation formation;
    private Map<String, ArrayList<Double>> resultats;

    public Etudiant(String nip, String n, String p) {
        this.identite = new Identite(nip,n,p);
        this.resultats = new HashMap<>();
    }

    public void ajoutNote(String matiere, Double note) {
        if ((note <= 20)&&(note >= 0)) {
            if (this.resultats.containsKey(matiere)) {
                this.resultats.get(matiere).add(note);
            } else {
                ArrayList<Double> notes = new ArrayList<>();
                notes.add(note);
                this.resultats.put(matiere, notes);
            }
        }
    }

    public Double calculMoyenne(String matiere) {
        Double somme = 0.0;
        int nbnotes = 0;
        if (!this.resultats.containsKey(matiere)) {
            return -1.0;
        } else {
            for (Double elt: this.resultats.get(matiere)) {
                nbnotes += 1;
                somme = somme + elt;
            }
            return somme/nbnotes;
        }
    }

    public Double calculMoyenneGenerale() {
        Double somme = 0.0;
        int nbnotes = 0;
        for (String matiere: this.resultats.keySet()) {
            for (Double elt: this.resultats.get(matiere)) {
                somme = somme + elt;
                nbnotes += 1;
            }
        }
        if (nbnotes == 0) {
            return -1.0;
        } else {
            return somme / nbnotes;
        }
    }

}