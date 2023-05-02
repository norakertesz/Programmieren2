package Orchester2;

import java.util.ArrayList;

public class Orchester {
    public ArrayList<Instrumente> alleInstrumente = new ArrayList<Instrumente>();


    public int playAll() {
        int summe = 0;
        for (Instrumente i : alleInstrumente) {

            summe += i.play();
        }
        return summe;
    }

    public void add(Instrumente i) {
        alleInstrumente.add(i);
    }

    @Override
    public String toString() {
        return "Orchester{" +
                "alleInstrumente=" + alleInstrumente +
                '}';
    }
}
