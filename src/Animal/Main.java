package Animal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Animal a= new Animal(); //keine Instanz erzeugen moeglich da abstract


        Giraffe georg = new Giraffe("Georg", 4, "braun", 43);
        Papagei pauli = new Papagei("Pauli", 2, "blau");

        pauli.makingNoise("menj a picsaba");
        georg.presentiertFlecken();

        Animal g1 = georg;
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(g1);
        zoo.add(pauli);
        System.out.println(zoo);
        for (Animal a : zoo) {
            a.move(100);
        }



    }


}

