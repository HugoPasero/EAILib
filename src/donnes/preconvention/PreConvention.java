package donnes.preconvention;

import donnes.date.DateConvention;
import java.io.Serializable;

/**
 * Objet préconvention de stage de notre base avec les méthodes utiles à la manipulation ces dernières
 * @author marieroca
 */
public class PreConvention implements Serializable{
    private Long id;
    protected boolean valide;
    protected DateConvention dateDeb, dateFin;
    protected float gratification;
    protected String stage, resumeSujet, entreprise, tuteur, numEntreprise;
    protected Etudiant etudiant;

    /**
     * Construction de la préconvention de stage au sein de l'université
     * @param id identification de la préconvention de stage
     * @param dateDeb date de début du stage
     * @param dateFin date de fin du stage
     * @param gratification montant en euros/mois de la gratification du stage
     * @param stage initulé du stage
     * @param resumeSujet résumé du sujet de stage
     * @param entreprise nom de l'entreprise accueillant l'étudiant pour le stage
     * @param numEntreprise numéro de SIREN de l'entreprise accueillant l'étudiant pour le stage
     * @param etudiant étudiant effectuant le stage
     */
    public PreConvention(Long id, DateConvention dateDeb, DateConvention dateFin, float gratification, String stage, String resumeSujet, String entreprise, String numEntreprise, Etudiant etudiant) {
        this.valide = true;
        this.id = id;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.gratification = gratification;
        this.stage = stage;
        this.resumeSujet = resumeSujet;
        this.entreprise = entreprise;
        this.numEntreprise = numEntreprise;
        this.etudiant = etudiant;
    }
    
    /**
     * Getter de l'identifiant de la préconvention de stage
     * @return l'identifiant de la préconvention de stage
     */
    public Long getId() {
        return id;
    }
    
    /**
     * Méthode retournant la validité de la préconvention de stage
     * @return true si la préconvention a été validée, false si elle a été refusée
     */
    public boolean estValide() {
        return valide;
    }

    /**
     * Méthode modifiant la validité de la préconvention de stage
     * @param valide validité (true ou false) de la préconvention de stage
     */
    public void setValidite(boolean valide) {
        this.valide = valide;
    }

    /**
     * Getter de la date de début du stage
     * @return la date de début du stage
     */
    public DateConvention getDateDeb() {
        return dateDeb;
    }

    /**
     * Setter de la date de début du stage
     * @param dateDeb nouvelle date de début du stage
     */
    public void setDateDeb(DateConvention dateDeb) {
        this.dateDeb = dateDeb;
    }

    /**
     * Getter de la date de fin du stage
     * @return la date de fin du stage
     */
    public DateConvention getDateFin() {
        return dateFin;
    }

    /**
     * Setter de la date de fin du stage
     * @param dateDeb nouvelle date de fin du stage
     */
    public void setDateFin(DateConvention dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Getter de la gratification du stage pour l'étudiant (en euros/mois)
     * @return la gratification du stage pour l'étudiant (en euros/mois)
     */
    public float getGratification() {
        return gratification;
    }

    /**
     * Setter de la gratification du stage pour l'étudiant (en euros/mois)
     * @param gratification nouvelle gratification du stage pour l'étudiant (en euros/mois)
     */
    public void setGratification(float gratification) {
        this.gratification = gratification;
    }

    /**
     * Getter de l'intitulé du stage de la préconvention
     * @return l'initulé du stage de la préconvention
     */
    public String getStage() {
        return stage;
    }

    /**
     * Setter de l'intitulé du stage de la préconvention
     * @param stage nouvel intitulé du stage de la préconvention
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * Getter du résumé des activités du stage de la préconvention
     * @return résumé des activités du stage de la préconvention
     */
    public String getResumeSujet() {
        return resumeSujet;
    }

    /**
     * Setter du résumé des activités du stage de la préconvention
     * @param resumeSujet nouveau résumé des activités du stage de la préconvention
     */
    public void setResumeSujet(String resumeSujet) {
        this.resumeSujet = resumeSujet;
    }

    /**
     * Getter du nom de l'entreprise d'accueil de l'étudiant pour le stage décrit dans la préconvention
     * @return nom de l'entreprise d'accueil
     */
    public String getEntreprise() {
        return entreprise;
    }

    /**
     * Setter du nom de l'entreprise d'accueil de l'étudiant pour le stage décrit dans la préconvention
     * @param entreprise nouveau nom de l'entreprise d'accueil
     */
    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    /**
     * Getter du nom du tuteur encadrant l'étudiant pour le stage décrit dans la préconvention
     * @return nom du tuteur encadrant
     */
    public String getTuteur() {
        return tuteur;
    }

    /**
     * Setter du nom du tuteur encadrant l'étudiant pour le stage décrit dans la préconvention
     * @param tuteur nouveau nom du tuteur encadrant
     */
    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    /**
     * Getter du numéro de SIREN de l'entreprise d'accueil de l'étudiant pour le stage décrit dans la préconvention
     * @return numéro de SIREN de l'entreprise d'accueil
     */
    public String getNumEntreprise() {
        return numEntreprise;
    }

    /**
     * Setter du numéro de SIREN de l'entreprise d'accueil de l'étudiant pour le stage décrit dans la préconvention
     * @param numEntreprise nouveau numéro de SIREN de l'entreprise d'accueil
     */
    public void setNumEntreprise(String numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    /**
     * Getter de l'étudiant effectuant le stage décrit dans la préconvention
     * @return étudiant effectuant le stage
     */
    public Etudiant getEtudiant() {
        return etudiant;
    }

    /**
     * Setter de l'étudiant effectuant le stage décrit dans la préconvention
     * @param etudiant nouvel étudiant effectuant le stage
     */
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    
    /**
     * Chaine de caractère représentant la préconvention de stage
     * 
     * Etudiant : Nom : ------------------ Prénom :------------------------ n : -----------------------
     * Diplôme préparé : Niveau : -------- Intitulé : ------------------------------------------------------
     * Responsabilité civile : Compagnie assurance : ---------------------------------------n° contrat : ------------
     * Entreprise/Institution : ----------------------------------------------------------------- n°: ----------------------
     * Stage : Date début : --/--/-- Date fin --/--/-- gratification : --------ε
     * Résumé sujet et activités : -------------------------------------------------------------------------------------------
     * 
     * @return chaine de caractère représentant la préconvention de stage
     */
    @Override
    public String toString() {
        return "PreConvention :\nEtudiant :               Nom :" + this.etudiant.getNom() + " Prénom : " + this.etudiant.getNom() + " Num : " + this.etudiant.getId()
                            + "\nDiplome Préparé :        Niveau : " + this.etudiant.getDiplome().getNiveau() + " Intitulé : " + this.etudiant.getDiplome().getIntitule()
                            + "\nResponsabilité civile :  Compagnie assurance : " + this.etudiant.getAssurance() + " Num : " + this.etudiant.getContrat()
                            + "\nEntreprise/Institution : " + this.entreprise + " Num : " + this.numEntreprise
                            + "\nSatge :                  Date de début : " + this.dateDeb.toString()
                            + "\n                         Date de fin : " + this.dateFin.toString()
                            + "\n                         Gratification : " + this.gratification + "€"
                            + "\nRésumé des activités : " + this.resumeSujet 
                            + "\nValidité : " + this.valide;
    }
    
}
