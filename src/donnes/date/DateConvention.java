/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donnes.date;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author marieroca
 */
public class DateConvention implements Serializable{
    private Date date;
    final static SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    //static final long DUREE_UN_JOUR = 24 * 60 * 60 * 1000;
    /*//Si on veut prendre en compte différents formats de dates
        String s = "";
        if (dateEntree.contains("/"))
        s = "/";
        if (dateEntree.contains("-"))
        s = "-";
        if (dateEntree.contains("."))
        s = ".";
        String date[] = dateEntree.split(s);
        //et on split*/

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
     * Constructeur qui créé une date propre à l'entreprise à partir d'une date
     * @param date 
     *          date (type java.util.Date) permettant de créer la date entreprise
     */
    public DateConvention(Date date) {
        this.date = date;
    }
    
    /**
     * Calcule le nombre de jours entre deux dates
     * @param dateDeb
     *          Date de départ
     * @param dateFin
     *          Date de fin
     * @return le nombre de jours entre deux dates
     */
    /*public static int getNbJours(Date dateDeb, Date dateFin){
        long diff = Math.abs(dateDeb.getTime() - dateFin.getTime());
        long nbJours = (long)diff/DUREE_UN_JOUR;
        return (int)nbJours;
    }*/
    
    public static int nbMois(Date dateDeb, Date dateFin){
        int jDeb = (new DateConvention(dateDeb)).getJour();
        int jFin = (new DateConvention(dateFin)).getJour();
        if(jFin >= jDeb){
            if(dateFin.getYear() == dateDeb.getYear())
                return dateFin.getMonth()- dateDeb.getMonth();
            else if(dateFin.getYear() > dateDeb.getYear())
                return (dateFin.getYear() - dateDeb.getYear())*12 - dateDeb.getMonth() + dateDeb.getMonth();
        }
        else if(jFin < jDeb){
            if(dateFin.getYear() == dateDeb.getYear())
                return dateFin.getMonth() - dateDeb.getMonth() - 1;
            else if(dateFin.getYear() > dateDeb.getYear())
                return (dateFin.getYear() - dateDeb.getYear())*12 - dateDeb.getMonth() + dateDeb.getMonth() - 1;
        }
        return 100;
    }
    
    public static int nbJours(Date dateDeb, Date dateFin){
        int jDeb = (new DateConvention(dateDeb)).getJour();
        int jFin = (new DateConvention(dateFin)).getJour();
        if(jFin >= jDeb){
            return jFin - jDeb;
        }
            
        else
            switch(dateFin.getMonth()){
                case 2 :
                case 4 :
                case 6 :
                case 9 :
                case 11 :
                    return 31 - jDeb + jFin;
                case 3 :
                    return 29 - jDeb + jFin;
                default :
                    return 30 - jDeb + jFin;
            }
    }
    
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
     * 
     */
    public int getJour(){
        String j = FORMAT.format(date).split("/")[0];
        //int jour = ;
        if(j.toCharArray()[0] == '0')
            return Integer.parseInt(j.toCharArray()[1]+"");
        //String jour = ;
        //System.out.println(jour);
        return Integer.parseInt(j);
    }
    
}
