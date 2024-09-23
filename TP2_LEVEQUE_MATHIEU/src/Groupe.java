import java.util.ArrayList;

public class Groupe {

    private ArrayList<Etudiant> etudiants;
    private Formation formation;

    public Groupe(Formation f) {
        this.etudiants = new ArrayList<>();
        this.formation = f;
    }
}
