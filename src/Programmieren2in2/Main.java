package Programmieren2in2;

public class Main {
    public static void main(String[] args) {
        //statische Attributen koennen ohne Objekt verwenden werden.
        System.out.println(Dog.latinName);
        //rufe statische Methode auf
        Dog.printLatinName();
        Beagle snoopy = new Beagle("snoopy", 30, "Lasagne");
        snoopy.eatsLovedFood();
        snoopy.bark(" nyenyenye");

        Dog koci = new Dog("Kooocos", 3);
        koci.bark(" auuuu");

        Beagle freddie = new Beagle("Freddie", 5, "Gulasch");
        Dog doggo = freddie;
        //bellt wie ein Beagle Instanz auf der Dog Referez ist
        doggo.bark("wuffwuffwuff");

        //upcasten:Objekt einer KindKlasse wir auf Referenz der Basisklasse gespeichert.
        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");
        Beagle b1 = (Beagle) doggo2;
        b1.bark("wuffiwuff");
        b1.eatsLovedFood();

        System.out.println("----------------------------");
        Dog d1 = new Beagle("Nono", 2, "Banana");//Beagle Instanz - Dog Referenz
        d1.bark("wuff");
        //downcasten:Referenz einer Basisklasse auf Kindklasse casten
        Beagle beagle1 = (Beagle) d1;
        beagle1.eatsLovedFood();
        //((Beagle)d1).eatsLovedFood(); es ist gleich wie 2 Zeile vorher


        //instanceof Operator überprüft ob Instanz der Klasse entspricht
        if (d1 instanceof Dog) {
            System.out.println("yaaay ist eind Hund");
        }

        if (beagle1 instanceof Dog) {
            System.out.println("yaaay ist eind Hund");
        }
        if (d1 instanceof Beagle) {
            System.out.println("yaaay ist eind Hund");
        }
        Beagle b2 = (Beagle) d1; //hier kann es nicht mehr krachen - crush

        //überprüfen ob instanz genau einer konkreten klasse entspricht
        System.out.println("-----------getClass---------");

        if (doggo2.getClass().equals(Beagle.class)) {
            System.out.println("yaay auf doggo2 ist wirklich ein beagle");
        }

        if (doggo2.getClass().equals(Dog.class)) {
            System.out.println("Hier sollten wir nicht reinkommen");
        } else {
            System.out.println("beagle ist kein hund - sondern ein beagle");
        }


    }
}
