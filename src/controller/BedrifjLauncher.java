package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;

import java.util.ArrayList;
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

        ArrayList<Persoon> personen = new ArrayList<>();
        personen.add( new Werknemer("Mark", "Den Haag", 1000, afdelingen[2]));
        personen.add( new Werknemer("Angelique", "Rotterdam", 5000, afdelingen[2]));
        personen.add( new Werknemer("Caroline", "Delft", 4000, afdelingen[1]));
        personen.add( new Zzper("Klaas", "Diemen", afdelingen[3], 50.00));
        personen.add(new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00));
        personen.add(new Zzper("Jannie", "Utrecht", afdelingen[0], 60.00));
        personen.add(new Zzper("Annie", "Zwolle", afdelingen[0], 40.00));

        System.out.printf("Het aantal personen in het bedrijf is %d\n", Persoon.getAaantalpersonen());

        /* for (int teller = 0; teller < werknemers.length; teller++) {
            toonJaarInkomen(werknemers[teller]);
        }*/
        //Enhanced for-loop

        for (Persoon persoon : personen) {
            if (persoon instanceof Zzper){
                ((Zzper) persoon).huurIn(320);
            }

        }
        for (Persoon persoon : personen) {
            toonJaarInkomen(persoon);
        }

    }
}
