package Sortieren;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Frucht f1 = new Frucht("Mango",350,true);
        Frucht f2 = new Frucht("Banane",120,false);
        Frucht f3 = new Frucht("Ananas",700,true);
        Frucht f4 = new Frucht("Oapfel",200,true);

        Frucht [] fruechteArray={f1,f2,f3,f4};
        System.out.println(Arrays.toString(fruechteArray));
        System.out.println("****************************");
        //Sortiert:
        Arrays.sort(fruechteArray);
        System.out.println(Arrays.toString(fruechteArray));

        List<Frucht> fruchtliste = new ArrayList<>();
        fruchtliste.add(f1);  fruchtliste.add(f2);  fruchtliste.add(f3);  fruchtliste.add(f4);
        System.out.println("________________________________");
        System.out.println(fruchtliste);
        Collections.sort(fruchtliste);
        System.out.println(fruchtliste);
    }
}
