package Hase;

import java.util.ArrayList;
import java.util.Iterator;

public class Hasenstall {
    public ArrayList<Hase> haseList = new ArrayList<>();

    @Override
    public String toString() {
        return "Hasenstall{" +
                "haseList=" + haseList +
                '}';
    }

    public void addHase(Hase h) {
        haseList.add(h);
    }

    public void alleHasenHoppeln() {
        for (Hase h : haseList) {
            h.hoppeln();
        }
//        Iterator<Hase> hasenIterator = haseList.iterator();
//        while (hasenIterator.hasNext()){
//            Hase h =hasenIterator.next();
//            h.hoppeln();
//        }

    }

    public ArrayList<Hase> print() {
        for (Hase h : haseList) {
            System.out.println(h);
        }
        return null;
    }

}
