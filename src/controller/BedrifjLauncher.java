package controller;

import model.Persoon;

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
        System.out.println("Nummer van medewerker is " + baas.personeelsNummer);

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println("Aantal personen: " + Persoon.aantalPersonen);
        System.out.println("Nummer van medewerker is " + medewerker.personeelsNummer);
        // 15
        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);
        System.out.printf("%s verdient %.2f per jaar\n",baas.naam, baas.berekenJaarInkomen());
        System.out.printf("%s woont is %s\n", assistent.naam, assistent.woonplaats);
    }
}
