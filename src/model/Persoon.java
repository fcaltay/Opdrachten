package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Persoon {
    protected static final String DEFAULT_NAAM = "onbekend";
    protected static final String DEFAULT_WOONPLAATS = "onbekend";
    protected static int aantalPersonen = 0;

    protected String naam;
    protected String woonplaats;
    protected int personeelsNummer;
    protected Afdeling afdeling;

    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;
        //
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, DEFAULT_WOONPLAATS, new Afdeling());
    }

    public Persoon(){
        this(DEFAULT_NAAM);
    }

    public String getNaam() {
        return naam;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }


    public double berekenJaarInkomen(){
        return 0;
    }

    public static int getAaantalpersonen() {
        return aantalPersonen;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    @Override
    public String toString() {
        return String.format("%s woont in %s en werkt op %s", this.naam, this.woonplaats, afdeling.toString());
    }
}

