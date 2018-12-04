package donnes.date;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe de format Date des données.
 * Cette classe nous permet de faure les traitements qui nous sont necessaires sur les dates
 * @author marieroca
 */
public class DateConvention implements Serializable{
    private Date date;
    final static SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Constructeur qui créé une date propre à l'application à partir de aujourd'hui
     */
    public DateConvention() {
        date = new Date();
    }

    /**
     * Constructeur qui créé une date propre à l'application à partir d'une chaine de caractère passée en paramètre
     * @param date
     *          chaine de caractère représentant la date "jj/mm/aaaa"
     * @throws java.text.ParseException
     *          exception soulevée si la chaine de caractère ne permet pas de créer la date
     */
    public DateConvention(String date) throws ParseException{
        this.date = (Date) FORMAT.parse(date);
    }
    
    /**
     * Constructeur qui créé une date propre à l'application à partir d'une date
     * @param date 
     *          date (type java.util.Date) permettant de créer la date entreprise
     */
    public DateConvention(Date date) {
        this.date = date;
    }
    
    /**
     * Calcule le nombre de mois entre deux dates
     * @param dateDeb
     *          Date de départ
     * @param dateFin
     *          Date de fin
     * @return le nombre de mois entre deux dates
     */
    public static int nbMois(Date dateDeb, Date dateFin){
        int jDeb = (new DateConvention(dateDeb)).getJour();
        int jFin = (new DateConvention(dateFin)).getJour();
        //Si le numéro du jour dans le mois de la date de fin est supérieur ou égal au numéro du jour de la date de deb 
        if(jFin >= jDeb){
            //Si date deb et date fin sont dans la même année
            if(dateFin.getYear() == dateDeb.getYear())
                //nbMois est égal à la différence
                return dateFin.getMonth()- dateDeb.getMonth();
            //Sinon si l'année de fin > année de deb
            else if(dateFin.getYear() > dateDeb.getYear())
                //nbMois = nb années de diff * 12 (= nb de mois d'années complète de diff)
                //          - num de mois de la date deb + num de mois de la date fin
                return (dateFin.getYear() - dateDeb.getYear())*12 - dateDeb.getMonth() + dateDeb.getMonth();
        }
        //Si le numéro du jour dans le mois de la date de fin est inférieur au numéro du jour de la date de deb 
        else if(jFin < jDeb){
            //Si date deb et date fin sont dans la même année
            if(dateFin.getYear() == dateDeb.getYear())
                // nbMois = la diff - le mois "à cheval"
                return dateFin.getMonth() - dateDeb.getMonth() - 1;
            //Sinon si l'année de fin > année de deb
            else if(dateFin.getYear() > dateDeb.getYear())
                //nbMois = nb années de diff * 12 (= nb de mois d'années complète de diff)
                //          - num de mois de la date deb + num de mois de la date fin - le mois "à cheval"
                return (dateFin.getYear() - dateDeb.getYear())*12 - dateDeb.getMonth() + dateDeb.getMonth() - 1;
        }
        return 100;
    }
    
    /**
     * Calcule le nombre de jours entre deux dates moins le nombre de mois
     * Exemple : entre le 01/05/18 et le 20/06/18 il y a 20 jours (et 1 mois)
     * @param dateDeb
     *          Date de départ
     * @param dateFin
     *          Date de fin
     * @return le nombre de mois entre deux dates
     */
    public static int nbJours(Date dateDeb, Date dateFin){
        int jDeb = (new DateConvention(dateDeb)).getJour();
        int jFin = (new DateConvention(dateFin)).getJour();
        //Si le numéro du jour dans le mois de la date de fin est supérieur au numéro du jour de la date de deb 
        if(jFin >= jDeb){
            //nbJours est égal à la différence
            return jFin - jDeb;
        //Sinon
        }else
            switch(dateFin.getMonth()){
                //Si c'est un mois à 31 jours
                case 2 :
                case 4 :
                case 6 :
                case 9 :
                case 11 :
                    return 31 - jDeb + jFin;
                //Si c'est février (on ne traite pas les cas des années bissextiles
                case 3 :
                    return 29 - jDeb + jFin;
                //Sinon c'est un mois à 30 jours
                default :
                    return 30 - jDeb + jFin;
            }
    }
    
    /**
     * Chaine de caractère représentant la date
     * @return une chaine de caractère représentant la date
     */
    @Override
    public String toString(){
        return FORMAT.format(date);
    }
    
    /**
     * Getter sur la date courante
     * @return la date courante
     */
    public Date getDate(){
        return date;
    } 
    
    /**
     * Méthode permettant de retourner le numero du jour dans le mois
     * Exemple 18/01/17 retourne 18
     * @return le numéro du jour dans le mois
     */
    private int getJour(){
        String j = FORMAT.format(date).split("/")[0];
        //int jour = ;
        if(j.toCharArray()[0] == '0')
            return Integer.parseInt(j.toCharArray()[1]+"");
        //String jour = ;
        //System.out.println(jour);
        return Integer.parseInt(j);
    }
    
}
