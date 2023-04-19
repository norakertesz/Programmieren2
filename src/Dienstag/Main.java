package Dienstag;

import Donnerstag3.Friend;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produkt produkt = new Produkt("Milk", 1.5);
        produkt.setDiscount(20);
        produkt.getPriceWithDiscount();
        System.out.println(produkt);

        Produkt produkt2 = new Produkt("Bread", 2.5,"White");
        Produkt produkt3 = new Produkt("Choco", 0.5,"Dark");
        Produkt produkt4 = new Produkt("Toy", 7);
        produkt2.setDiscount(10);
        produkt.getPriceWithDiscount();
        System.out.println(produkt2);
        produkt2.setDescription("White with Sesam");
        System.out.println(produkt2);
        System.out.println("LIDL:");
        Shop lidl = new Shop();
        lidl.addProdukt(produkt);
        lidl.addProdukt(produkt2);
        lidl.addProdukt(produkt3);
        lidl.addProdukt(produkt4);
        System.out.println(lidl.getProdukt());
        System.out.println("---------FROM---------");

        ArrayList<Produkt> listByPriceFrom = lidl.getByPriceFrom(2.1);
        System.out.println(listByPriceFrom);

        System.out.println("---------TO-----------");
        ArrayList<Produkt> getByPriceTo = lidl.getByPriceTo(2.0);
        System.out.println(getByPriceTo);
        lidl.removeProductsfromByIterator(6.0);
        System.out.println(lidl.getProdukt());
        lidl.addProdukt(produkt4);
        System.out.println("Toy");
        System.out.println(lidl.getProdukt());
        System.out.println("---------removeProductsFromByKeySet-----------");
        lidl.removeProductsFromByKeySet(6.0);
        System.out.println(lidl.getProdukt());








    }

}
