/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donnes.preconvention;

import donnes.date.DateConvention;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author marieroca
 */
public class PreConvention implements Serializable{
    //private static final long serialVersionUID = 1L;

    private Long id;
    protected boolean valide;
    protected DateConvention dateDeb, dateFin;
    protected float gratification;
    protected String stage, resumeSujet, entreprise, tuteur, numEntreprise;
    protected Etudiant etudiant;
            
    public Long getId() {
        return id;
    }
    
    /*public void setId(Long id) {
        this.id = id;
    }*/

    public PreConvention(Long id, DateConvention dateDeb, DateConvention dateFin, float gratification, String stage, String resumeSujet, String entreprise, String tuteur, String numEntreprise, Etudiant etudiant) {
        this.valide = true;
        this.id = id;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.gratification = gratification;
        this.stage = stage;
        this.resumeSujet = resumeSujet;
        this.entreprise = entreprise;
        this.tuteur = tuteur;
        this.numEntreprise = numEntreprise;
        this.etudiant = etudiant;
    }
    
    public boolean estValide() {
        return valide;
    }

    public void setValidite(boolean valide) {
        this.valide = valide;
    }

    public DateConvention getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(DateConvention dateDeb) {
        this.dateDeb = dateDeb;
    }

    public DateConvention getDateFin() {
        return dateFin;
    }

    public void setDateFin(DateConvention dateFin) {
        this.dateFin = dateFin;
    }

    public float getGratification() {
        return gratification;
    }

    public void setGratification(float gratification) {
        this.gratification = gratification;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getResumeSujet() {
        return resumeSujet;
    }

    public void setResumeSujet(String resumeSujet) {
        this.resumeSujet = resumeSujet;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    public String getNumEntreprise() {
        return numEntreprise;
    }

    public void setNumEntreprise(String numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    
    @Override
    public String toString() {
        return "PreConvention :\nEtudiant :               Nom :" + this.etudiant.getNom() + " Prénom : " + this.etudiant.getNom() + " Num : " + this.etudiant.getId()
                              + "Diplome Préparé :        Niveau : " + this.etudiant.getDiplome().getNiveau() + " Intitulé : " + this.etudiant.getDiplome().getIntitule()
                              + "Responsabilité civile :  Compagnie assurance : " + this.etudiant.getAssurance() + " Num : " + this.etudiant.getContrat()
                              + "Entreprise/Institution : " + this.entreprise + " Num : " + this.numEntreprise
                              + "Satge :                  Date de début : " + this.dateDeb.toString()
                                                        + " Date de fin : " + this.dateFin.toString()
                                                        + " Gratification : " + this.gratification + "€"
                              + "Résumé des activités : " + this.resumeSujet;
    }
    
}
