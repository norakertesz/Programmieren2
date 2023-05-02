package Hase;

import Sortieren.Frucht;

public class Hase implements GoesToParty, Comparable<Hase>{


    protected String name;
    protected int alter;
    protected int carrotNr;

    public Hase(String name, int alter, int c) {
        this.name = name; this.alter=alter;this.carrotNr=c;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void schlafen() {
        System.out.println(name + " schläft");
    }

    public void hoppeln() {
        System.out.println(name + " hopi hopp.");
    }

    public void fressen() {
        System.out.println(name + " isst.");
    }

    @Override
    public String toString() {
        return name +" "+ alter+" Jahre alt.";
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(name+" geht zur Party und isst "+cake+" und trinkt "+drink+".");
    }

    public int compareTo(Hase o) {

        if (this.alter < o.alter) {
            return -1;
        }
        if (this.alter > o.alter) {
            return 1;
        }
        if (this.carrotNr< o.carrotNr) {
            return -1;
        }
        if (this.carrotNr > o.carrotNr) {
            return 1;
        }
        // Integer vergleich verwenden:
        //Integer.compare(1,4);

        return 0;
    }
}
