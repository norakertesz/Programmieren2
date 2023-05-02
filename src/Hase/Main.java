package Hase;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("************OSTERHASE**************");
        Osterhase hasi = new Osterhase("Hasi");
        hasi.versteckeOstereier();
        hasi.hoppeln();
        hasi.schlafen();
        System.out.println();
        System.out.println("************WEIHNACHTSHASE**************");
        Weihnachtshase roger = new Weihnachtshase("Roger");
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
        partyPeople.add(new Hase("Bernhard"));
        partyPeople.add(new Igel());
        for (GoesToParty p:
             partyPeople) {
            p.party("Gluehwein","Schokokuchen");
        }

    }

}
