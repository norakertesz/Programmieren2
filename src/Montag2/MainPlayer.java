package Montag2;

import java.util.ArrayList;

public class MainPlayer {
    public static void main(String[] args) {

        PlayerListe playerListe = new PlayerListe();
        Player p1 = new Player("Nora");
        Player p2 = new Player("Kata");
        Player p3 = new Player("Veronika");
        Player p4 = new Player("Vici");

        playerListe.addOrUpdate(p1,150);
        playerListe.addOrUpdate(p2,180);
        playerListe.addOrUpdate(p3,100);
        playerListe.addOrUpdate(p4,80);
        System.out.println("PLAYER LISTE:");
        System.out.println(playerListe.getPlayer());
        playerListe.addOrUpdate(p4,85);
        System.out.println(playerListe.getPlayer());
        playerListe.addOrUpdate(p4,80);
        System.out.println(playerListe.getPlayer());
        System.out.println("getPlayerWithPoints - Player who have more than 150 points");
        ArrayList<Player> list=playerListe.getPlayerWithPoints(150);
        System.out.println(list);

    }
}
