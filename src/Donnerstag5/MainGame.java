package Donnerstag5;

import Donnerstag4.EventCalendar;

public class MainGame {
    public static void main(String[] args) {
        Player p1 = new Player("Kata",Team.A,15);
        Player p2 = new Player("Cheda",Team.B,25);
        Player p3 = new Player("Victoria",Team.C,5);
        Player p4 = new Player("Sofia",Team.D,35);

        Verwaltung myGame = new Verwaltung();
        myGame.addPlayer(p1);
        myGame.addPlayer(p2);
        myGame.addPlayer(p3);
        myGame.addPlayer(p4);
        System.out.println("");
        System.out.println("-----PRINT-----");
        myGame.print();
        System.out.println("");
        System.out.println("-----getPlayerById-----");
        System.out.println(myGame.getPlayerById(1));
        System.out.println("-----PRINT-----");
        myGame.print();
    }
}
