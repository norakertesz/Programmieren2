package WG;

import HOme.Task;

import java.util.ArrayList;

public class Wohngemeinschaft {
    Adresse adresse;
   private ArrayList<Person> personen=new ArrayList<>();

    public Wohngemeinschaft(Adresse adresse) {
        this.adresse = adresse;
    }

    public void add(Person p) {
        personen.add(p);
    }

    public ArrayList<Person> getPersonen() {
        return personen;
    }
}
