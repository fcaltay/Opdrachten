package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Persoon {
    public static final String DEFAULT_NAAM = "onbekend";
    public static final String DEFAULT_WOONPLAATS = "onbekend";
    public static final int DEFAULT_MAANDSALARIS = 0;
    public static final int MAANDEN_PER_JAAR = 12;
    public static int aantalPersonen = 0;

    public String naam;
    public String woonplaats;
    public double maandsalaris;
    public int personeelsNummer;

    public Persoon(String naam, String woonplaats, double maandsalaris) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandsalaris = maandsalaris;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this.naam = naam;
        this.woonplaats = DEFAULT_WOONPLAATS;
        this.maandsalaris = DEFAULT_MAANDSALARIS;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(){
        this.naam = DEFAULT_NAAM;
        this.woonplaats = DEFAULT_WOONPLAATS;
        this.maandsalaris = DEFAULT_MAANDSALARIS;
        this.personeelsNummer = ++aantalPersonen;
    }

    public double berekenJaarInkomen(){
        return MAANDEN_PER_JAAR * maandsalaris;
    }

}
