package WG;

import Donnerstag3.Friend;

import java.util.ArrayList;
import java.util.List;

public class Adresse {

    private String strasse;
    private int hausnummer;
    private String stadt;
    private int plz;

    public Adresse(String strasse, int hausnummer, String stadt, int plz) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.stadt = stadt;
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                ", stadt='" + stadt + '\'' +
                ", plz=" + plz +
                '}';
    }


}
