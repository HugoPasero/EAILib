package donnes.preconvention;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Objet étudiant de notre base avec les méthodes utiles à la manipulation de l'étudiant
 * @author marieroca
 */

    
public class Etudiant implements Serializable {
    private Long id;
    protected String nom, prenom, assurance, contrat;
    protected Diplome diplome;
    protected List<PreConvention> preConventions = new ArrayList<>();

    /**
     * Construction de l'étudiant au sein de l'université
     * @param id numéro étudiant
     * @param nom nom de l'étudiant
     * @param prenom prénom de l'étudiant
     * @param assurance nom de la compagnie d'assurance de l'étudiant
     * @param contrat numéro de contrat d'assurance de l'étudiant
     * @param diplome diplome préparé par l'étudiant
     */
    public Etudiant(Long id, String nom, String prenom, String assurance, String contrat, Diplome diplome) {
        this.nom = nom;
        this.prenom = prenom;
        this.assurance = assurance;
        this.contrat = contrat;
        this.diplome = diplome;
        this.id = id;
    }
    
    /**
     * Getter de l'identifiant de l'étudiant
     * @return l'identifiant de l'étudiant
     */
    public Long getId() {
        return id;
    }

    /**
     * Getter du nom de l'étudiant
     * @return nom de l'étudiant
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter du nom de l'étudiant
     * @param nom nouveau nom de l'étudiant
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter du prénom de l'étudiant
     * @return prénom de l'étudiant
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter du prénom de l'étudiant
     * @param nom nouveau prénom de l'étudiant
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Getter du nom de la compagnie d'assurance de l'étudiant
     * @return nom de la compagnie d'assurance de l'étudiant
     */
    public String getAssurance() {
        return assurance;
    }

    /**
     * Setter du nom de la compagnie d'assurance de l'étudiant
     * @param assurance nouveau nom de la compagnie d'assurance de l'étudiant
     */
    public void setAssurance(String assurance) {
        this.assurance = assurance;
    }

    /**
     * Getter du numéro de contrat d'assurance de l'étudiant
     * @return numéro de contrat d'assurance de l'étudiant
     */
    public String getContrat() {
        return contrat;
    }

    /**
     * Setter du numéro de contrat d'assurance de l'étudiant
     * @param contrat numéro de contrat d'assurance de l'étudiant
     */
    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    /**
     * Getter du diplôme de l'étudiant
     * @return diplôme de l'étudiant
     */
    public Diplome getDiplome() {
        return diplome;
    }

    /**
     * Setter du diplôme de l'étudiant
     * @param diplome diplôme de l'étudiant
     */
    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    /**
     * Chaine de caractère représentant l'étudiant
     * @return chaine de caractère représentant l'étudiant
     */
    public String toString() {
        return "Etudiant : " + this.nom + ", " + this.prenom + " en " + this.diplome + 
                "\n_Assurance : " + this.assurance + ", no " + this.contrat;
        
    }
    
}
    

