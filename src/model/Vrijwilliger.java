package model;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class Vrijwilliger extends Persoon implements Oproepbaar{
    private int urenGewerkt;

    public Vrijwilliger(String naam, String woonplaats, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
    }

    public double berekenJaarInkomen(){
        return 0;
    }

    @Override
    public void huurIn(int uren) {

    }

    @Override
    public String toString() {
        return String.format("%s en is een vrijwilleger", super.toString());
    }
}
