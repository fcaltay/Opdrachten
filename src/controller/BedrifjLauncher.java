package controller;

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
        System.out.println("Aantal personen: " + Persoon.aantalPersonen);
        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println("Aantal personen: " + Persoon.aantalPersonen);
        //Tijdens het instantieren van baas wordt aantalPersonen verhoogd met 1(en is dus gelijk aan 1)
        System.out.println("Nummer van medewerker is " + baas.getPersoneelsNummer());

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println("Aantal personen: " + Persoon.aantalPersonen);
        System.out.println("Nummer van medewerker is " + medewerker.getPersoneelsNummer());
        // 15
        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);

        Persoon[] medewerkers = new Persoon[3];
        medewerkers[0] = new Persoon("Mark","Leek",10000);
        medewerkers[1] = new Persoon("Caroline","Marum",4000);
        medewerkers[2] = new Persoon("Arjen","Roden",-200);

        for (int teller = 0; teller < medewerkers.length; teller++) {
            System.out.printf("%s verdient %.2f ",medewerkers[teller].getNaam(), medewerkers[teller].getMaandsalaris());
            if (medewerkers[teller].heeftRechtOpBonus()) {
                System.out.println("en wel recht op een bonus.");
            }
            else {
                System.out.println("en heeft geen recht op bonus.");
            }
        }


    }
}
