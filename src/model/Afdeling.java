package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Afdeling {
    private static final String DEFAULT_NAAM = "Onbekend";
    private static final String DEFAULT_PLAATS = "Onbekend";

    private String afdelingNaam;
    private String afdelingPlaats;

    public Afdeling(String afdelingNaam, String afdelingPlaats) {
        this.afdelingNaam = afdelingNaam;
        this.afdelingPlaats = afdelingPlaats;
    }

    public Afdeling() {
        this(DEFAULT_NAAM,DEFAULT_PLAATS);
    }

    public String getAfdelingNaam() {
        return afdelingNaam;
    }

    public void setAfdelingNaam(String afdelingNaam) {
        this.afdelingNaam = afdelingNaam;
    }

    public String getAfdelingPlaats() {
        return afdelingPlaats;
    }

    public void setAfdelingPlaats(String afdelingPlaats) {
        this.afdelingPlaats = afdelingPlaats;
    }
}
