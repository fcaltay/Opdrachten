package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Persoon {
    private static double GRENSWAARDE_BONUS = 4500.0;
    private static final String DEFAULT_NAAM = "onbekend";
    private static final String DEFAULT_WOONPLAATS = "onbekend";
    private static final int DEFAULT_MAANDSALARIS = 0;
    private static final int MAANDEN_PER_JAAR = 12;
    private static int aantalPersonen = 0;

    private String naam;
    private String woonplaats;
    private double maandsalaris;
    private int personeelsNummer;

    public Persoon(String naam, String woonplaats, double maandsalaris) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        setMaandsalaris(maandsalaris);
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam,DEFAULT_WOONPLAATS,DEFAULT_MAANDSALARIS);
    }

    public Persoon(){
        this(DEFAULT_NAAM);
    }


    public String getNaam() {
        return naam;
    }

    public void setMaandsalaris(double maandsalaris) {
       if (maandsalaris < 0) {
           System.out.println("Het bedrag kan niet negatief zijn.");
           this.maandsalaris = DEFAULT_MAANDSALARIS ;
       }
       else {
           this.maandsalaris = maandsalaris;
       }
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public double berekenJaarInkomen(){
        return MAANDEN_PER_JAAR * maandsalaris;
    }

    public boolean heeftRechtOpBonus() {
        return maandsalaris >= GRENSWAARDE_BONUS;
    }

    public static int getAaantalpersonen() {
        return aantalPersonen;
    }

    public double getMaandsalaris() {
        return maandsalaris;
    }

}

