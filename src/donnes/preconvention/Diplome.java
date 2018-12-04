package donnes.preconvention;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Objet diplôme de notre base avec les méthodes utiles à la manipulation du diplôme
 * @author marieroca
 */
public class Diplome implements Serializable{
    private String id;
    
    public enum Niveau{
        L1, L2, L3, M1, M2
    };
    private Niveau niveau;
    private String intitule;
    private List<Etudiant> etudiants = new ArrayList<>();

    /**
     * Construction du diplôme au sein de l'université
     * @param id Code interne de la formation
     * @param niveau Niveau du diplome (L1, L2, L3, M1 ou M2)
     * @param intitule Nom de la formation
     */
    public Diplome(String id, Niveau niveau, String intitule) {
        this.id = id;
        this.niveau = niveau;
        this.intitule = intitule;
    }

    /**
     * Getter de l'identifiant du diplôme
     * @return l'identifiant du diplôme
     */
    public String getId() {
        return id;
    }

    /**
     * Getter du le niveau du diplôme
     * @return le niveau du diplôme
     */
    public Niveau getNiveau() {
        return niveau;
    }

    /**
     * Setter du le niveau du diplôme
     * @param niveau le niveau du diplôme
     */
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    /**
     * Getter de l'intitule du diplôme
     * @return l'intitule du diplôme
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * Setter de l'intitule du diplôme
     * @param intitule l'intitule du diplôme
     */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    /**
     * Chaine de caractère représentant le diplôme
     * @return chaine de caractère représentant le diplôme
     */
    public String toString() {
        //return "entities.Diplome[ id=" + id + " ]";
        return "Diplome : " + this.niveau + " " + this.intitule;
    }
}
