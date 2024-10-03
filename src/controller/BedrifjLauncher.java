package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;

import java.util.Arrays;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class BedrifjLauncher {

    public BedrifjLauncher() {
    }

    public static void main(String[] args) {
        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering","Hilversium");
        afdelingen[1] = new Afdeling("Support","Amsterdam");
        afdelingen[2] = new Afdeling("Management","Almere");
        afdelingen[3] = new Afdeling("Documentatie","Gouda");

        Werknemer baas = new Werknemer ("Mark", "Den Haag", 1000, afdelingen[2]);
        Werknemer  medewerker = new Werknemer("Caroline", "Delft", 4000, afdelingen[1]);
        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50.00);

        System.out.printf("Het aantal personen in het bedrijf is %d\n",Persoon.getAaantalpersonen());
        System.out.println(baas.toString());
        System.out.println(medewerker.toString());
        System.out.println(assistent.toString());

        System.out.printf("%s verdient %.2f per jaar\n", baas.getNaam(), baas.berekenJaarinkomen());
        System.out.printf("%s verdient %.2f per jaar\n", medewerker.getNaam(), medewerker.berekenJaarinkomen());
        assistent.huurIn(160);
        System.out.printf("%s verdient %.2f per jaar\n", assistent.getNaam(), assistent.berekenJaarInkomen());

    }
}
