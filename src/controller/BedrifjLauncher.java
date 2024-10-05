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
    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar.\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }

    public static void main(String[] args) {
        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversium");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        Persoon[] werknemers = new Persoon[4];
        Werknemer baas = new Werknemer("Mark", "Den Haag", 1000, afdelingen[2]);
        Werknemer medewerker = new Werknemer("Caroline", "Delft", 4000, afdelingen[1]);
        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50.00);
        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00);

        werknemers[0] = baas;
        werknemers[1] = medewerker;
        werknemers[2] = assistent;
        werknemers[3] = projectleider;
        System.out.printf("Het aantal personen in het bedrijf is %d\n", Persoon.getAaantalpersonen());
        assistent.huurIn(160);
        projectleider.huurIn(320);
       for (int teller = 0; teller < werknemers.length; teller++) {
           toonJaarInkomen(werknemers[teller]);
       }

    }
}
