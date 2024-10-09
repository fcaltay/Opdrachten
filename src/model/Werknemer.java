package model;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Werknemer extends Persoon {
    public static final int ANTAL_MAANDEN_IN_EEN_JAAR = 12;
    public static final int DEFAULT_MAAND_SALARIS = 0;
    private static final double GRENSWAARDE_BONUS = 4500.0;
    private double maandSalaris;
    Scanner toetsenbord = new Scanner(System.in);


    public Werknemer(String naam, String woonplaats,  double maandSalaris, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
        this.maandSalaris = maandSalaris;
        setMaandSalaris(maandSalaris);
    }

    public Werknemer(String naam) {
        this(naam, DEFAULT_WOONPLAATS,  0.0, new Afdeling());
    }

    public Werknemer() {
        this(DEFAULT_NAAM);
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < 0) {
            throw new IllegalArgumentException("Het maandsalaris mag niet negatief zijn.");
        }
        this.maandSalaris = maandSalaris;
    }

    public double berekenJaarInkomen() {
        if(heeftRechtOpBonus()){
            return (ANTAL_MAANDEN_IN_EEN_JAAR * maandSalaris) + maandSalaris;
        }
        return (ANTAL_MAANDEN_IN_EEN_JAAR * maandSalaris);
    }

    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    @Override
    public String toString() {
        if (heeftRechtOpBonus()) {
            return String.format("%s en is een medewerker met recht op bonus", super.toString());
        }
        else {
            return String.format("%s en is een medewerker zonder recht op bonus", super.toString());
        }
    }
}
