package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class BedrifjLauncher {

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar.\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }

    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);

        ArrayList<Afdeling> afdelingen = new ArrayList<>();
        File afdelingenBestand = new File("resources/Afdelingen.txt");

        try (Scanner invoer = new Scanner(afdelingenBestand)) {
            while (invoer.hasNext()) {
                afdelingen.add(new Afdeling(invoer.next(), invoer.next()));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Bestand kon niet geopend worden");
            System.out.println(fileNotFoundException.getMessage());
        }


        ArrayList<Persoon> personen = new ArrayList<>();
        File personenBestand = new File("resources/Personen.csv");

        System.out.print("Geef de naam: ");
        String naam = toetsenbord.next();

        System.out.print("Geef de woonplaats: ");
        String woonplaats = toetsenbord.next();

        System.out.print("Geef de naam van de afdeling: ");
        String naamVanDeAfdeling = toetsenbord.next();

        System.out.print("Geef de plaats van de afdeling: ");
        String plaatsVanDeAfdeling = toetsenbord.next();

        Afdeling afdeling = new Afdeling(naamVanDeAfdeling, plaatsVanDeAfdeling);

        boolean hetIsNietGelukt = true;
        while (hetIsNietGelukt) {
            System.out.print("Geef het maandsalaris: ");
            double maandsalaris = toetsenbord.nextDouble();

            try {
                personen.add (new Werknemer(naam, woonplaats, maandsalaris, afdeling));
                hetIsNietGelukt = false;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
                toetsenbord.next();
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld");
            }
        }

        try (Scanner invoer = new Scanner(personenBestand)) {
            while (invoer.hasNextLine()) {
                String[] regelArray = invoer.nextLine().split(",");

                String typePersoon = regelArray[0];
                String naamPersoon = regelArray[1];
                String woonplaatsPersoon = regelArray[2];
                int indexVanArray = Integer.parseInt(regelArray[3]);
                double maandSalarisOfUur = Double.parseDouble(regelArray[4]);

                personen.add(new Persoon(naamPersoon, woonplaatsPersoon, afdelingen.get(indexVanArray)));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Bestand kon niet geopend worden");
            System.out.println(fileNotFoundException.getMessage());
        }

        try (PrintWriter printWriter = new PrintWriter("resources/PersonenPerAfdeling.csv")) {
            for (Afdeling afdelingItem : afdelingen) {
                printWriter.println("Afdeling: " + afdelingItem.getAfdelingNaam());

                for (Persoon persoon : personen) {
                    if (persoon.getAfdeling().equals(afdelingItem)) {
                        printWriter.println("-- " + persoon.toString());
                    }
                }
                printWriter.println();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Bestand kon niet geopend worden");
            System.out.println(e.getMessage());
        }

        for (Persoon persoon : personen) {
            System.out.println(persoon.toString());

        }

    }
}
