package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Zzper extends Persoon implements Oproepbaar{
    private final int DEFAULT_UREN_GEWERKT = 0;

    private double uurtarief;
    private int urenGewerkt;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurtarief) {
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
    }

    public int getDEFAULT_UREN_GEWERKT() {
        return DEFAULT_UREN_GEWERKT;
    }

    public double getUurtarief() {
        return uurtarief;
    }

    public void setUurtarief(double uurtarief) {
        this.uurtarief = uurtarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }

    public double berekenJaarInkomen() {
        return uurtarief * urenGewerkt;
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt += uren;
    }

    @Override
    public String toString() {
        return String.format("%s en is zzp-er met een uurtarief van %s.", super.toString(), this.uurtarief);
    }
}
