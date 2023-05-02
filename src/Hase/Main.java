package Hase;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("************OSTERHASE**************");
        Osterhase hasi = new Osterhase("Hasi", 3, 150);
        hasi.versteckeOstereier();
        hasi.hoppeln();
        hasi.schlafen();
        System.out.println();
        System.out.println("************WEIHNACHTSHASE**************");
        Weihnachtshase roger = new Weihnachtshase("Roger", 1, 12354);
        roger.verteileGeschenke();
        roger.hoppeln();
        System.out.println();
        System.out.println("************HASE/WEIHNACHTSHASE**************");
        Hase mini = roger;
        mini.fressen();
        mini.hoppeln();
        System.out.println();
        System.out.println("************HASENSTALL**************");
        Hasenstall h1 = new Hasenstall();
        h1.addHase(roger);
        h1.addHase(hasi);
        h1.alleHasenHoppeln();
        System.out.println(h1);
        System.out.println();
        System.out.println("*******************PARTY***********************");
        //eine kleine Party

        ArrayList<GoesToParty> partyPeople = new ArrayList<>();
        partyPeople.add(hasi);
        partyPeople.add(roger);
        partyPeople.add(new Hase("Bernhard", 2, 50));
        partyPeople.add(new Igel());
        for (GoesToParty p :
                partyPeople) {
            p.party("Gluehwein", "Schokokuchen");
        }
        Hase hase1 = new Hase("Gertrude", 10, 150);
        Hase hase2 = new Hase("Klotild", 5, 2000000);
        Hase hase3 = new Hase("Bunny", 5, 158923);
        Hase hase4 = new Hase("Popo", 7, 101);

        System.out.println();
        System.out.println("---------------------SORT METHOD------------------------");

        List<Hase> haseList = new ArrayList<>();
        haseList.add(hase1);
        haseList.add(hase2);
        haseList.add(hase3);
        haseList.add(hase4);
        haseList.add(roger);
        haseList.add(hasi);
        System.out.println(haseList);
        Collections.sort(haseList);
        System.out.println(haseList);
        Collections.sort(haseList, new HasenNamenComparator());
        System.out.println();
        System.out.println("******************SORT BY NAME********************");
        System.out.println(haseList);


    }

}
