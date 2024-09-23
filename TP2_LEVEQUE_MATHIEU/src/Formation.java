import java.util.HashMap;
import java.util.Map;

public class Formation {
    private String identifiant;
    private Map<String, Double> CollMatieres;

    public Formation(String identifiant) {
        this.identifiant = identifiant;
        CollMatieres = new HashMap<String, Double>();
    }

    public void adjMatiere(String matiere, Double valeur) {
        CollMatieres.put(matiere, valeur);
    }

    public void supprimerMatiere(String matiere) {
        CollMatieres.remove(matiere);
    }

    public double getCoeff(String matiere) {
        if (CollMatieres.containsKey(matiere)) {
            return CollMatieres.get(matiere);
        }
        return 0.0;
    }

    public String toString() {
        String res = "";
        for (Map.Entry<String, Double> entry : CollMatieres.entrySet()) {
            res += entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return res;
    }
}
