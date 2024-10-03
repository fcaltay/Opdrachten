package controller;

import model.Afdeling;
import model.Persoon;

import java.util.Arrays;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class BedrifjLauncher {

    public BedrifjLauncher() {
    }

    public static void main(String[] args) {
        // Omdat het static is, hebben we er toegang toe met de klas.
        /*Persoon[] medewerkers = new Persoon[3];
        medewerkers[0] = new Persoon("Mark","Leek",10000, new Afdeling("Uitvoering","Hilversium"));
        medewerkers[1] = new Persoon("Caroline","Marum",4000, new Afdeling("Support","Amsterdam"));
        medewerkers[2] = new Persoon("Arjen","Roden",-200, new Afdeling("Management","Almere"));*/

        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering","Hilversium");
        afdelingen[1] = new Afdeling("Support","Amsterdam");
        afdelingen[2] = new Afdeling("Management","Almere");
        afdelingen[3] = new Afdeling("Documentatie","Gouda");

        Persoon baas = new Persoon("Mark", "Den Haag", 1000, afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");

        System.out.printf("Het aantal personen in het bedrijf is %d\n",Persoon.getAaantalpersonen());
        System.out.printf("%s werkt in %s en woont in %s\n",baas.getNaam(), baas.getAfdeling().getAfdelingNaam(), baas.getAfdeling().getAfdelingPlaats());
        System.out.printf("%s werkt in %s en woont in %s en verdient %.2f\n",medewerker.getNaam(), medewerker.getAfdeling().getAfdelingNaam(), medewerker.getAfdeling().getAfdelingPlaats(),medewerker.getMaandsalaris());
        System.out.printf("%s werkt in %s en woont in %s\n",assistent.getNaam(), assistent.getAfdeling().getAfdelingNaam(), assistent.getAfdeling().getAfdelingPlaats());
    }
}
