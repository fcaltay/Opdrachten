package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Werknemer extends Persoon {
    public static final int ANTAL_MAANDEN_IN_EEN_JAAR = 12;
    private static final double GRENSWAARDE_BONUS = 4500.0;
    private double maandSalaris;

    public Werknemer(String naam, String woonplaats,  double maandSalaris, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
        this.maandSalaris = maandSalaris;
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
            System.out.println("Het bedrag kan niet negatief zijn.");
            this.maandSalaris = 0;
        }
        else {
            this.maandSalaris = maandSalaris;
        }
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
