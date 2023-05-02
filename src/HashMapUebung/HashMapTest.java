package HashMapUebung;

import Hase.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1 = new Hase("Hansi");
        Hase h2 = new Hase("Susy");
        steuerHasen.put("1234H", h1);
        steuerHasen.put("4325K", h2);
        //Wert auslesen von Angabe des Schlüssels
        System.out.println(steuerHasen.get("1234H"));
        //WWenn Schlüssel nicht vorhanden ist, kommt null aus
        System.out.println(steuerHasen.get("4325K"));

        System.out.println(steuerHasen.containsKey("1234H")); //Fragen ob 1 schlüssel in hashmap ist

        //Das ist langsam, nur im notfall verwenden:
        System.out.println(steuerHasen.containsValue(h2));

        //steuerHasen.put("1234H",h2);//Hase h2 statt Hase h1 "1234H" abrufbar

        //Über hashmap itarieren
        for (Map.Entry<String, Hase> hase : steuerHasen.entrySet()) {
            System.out.println(hase.getKey());
            Hase h = hase.getValue();
            h.hoppeln();

        }
      //  for (String key : steuerHasen.keySet()) {

        }
    }


