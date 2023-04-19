package Dienstag;


import java.util.*;
import java.util.Iterator;

public class Shop {
    Map<String, Produkt> produkte = new HashMap<>();

    public HashMap<String, Produkt> getProdukt() {
        return (HashMap<String, Produkt>) produkte;
    }

    public void addProdukt(Produkt produkt) {
        produkte.put(produkt.getTitle(), produkt);

    }

    public Produkt getProdukt(String title) {
        Produkt p = produkte.get(title);
        if (p == null) {
            System.out.println("Error");
        }
        return p;
    }


    public ArrayList<Produkt> getByPriceFrom(double from) {

        ArrayList<Produkt> result = new ArrayList<>();
        for (Produkt p : produkte.values()) {
            if (p.getPrice() > from) {
                result.add(p);
            }
        }
        return result;
    }

//    ArrayList<Produkt> result = new ArrayList<>();
//
//        for (String key:produkte.keySet()) {
//        Produkt p=produkte.get(key);
//        if ( p.getPrice()> from) {
//            result.add(p);
//        }
//    }
//}

    public ArrayList<Produkt> getByPriceTo(double to) {

        ArrayList<Produkt> result = new ArrayList<>();
        for (Produkt p : produkte.values()) {
            if (p.getPrice() < to) {
                result.add(p);
            }
        }
        return result;
    }

    public void removeProductsfromByIterator(double limit) {
        Iterator<Produkt> produktIT = produkte.values().iterator();

        while (produktIT.hasNext()) {
            Produkt produkt = produktIT.next();
            if (produkt.getPrice() > limit) {
                produktIT.remove();
            }
        }
    }

    public void removeProductsFromByKeySet(double from) {
        Set<String> keys = new HashSet<>();
        for (Produkt p : produkte.values()) {
            if (p.getPrice() > from) {
                keys.add(p.getTitle());
            }
        }
        produkte.keySet().removeAll(keys);
    }
}

