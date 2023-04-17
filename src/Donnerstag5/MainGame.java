package Donnerstag5;

import Donnerstag4.EventCalendar;

public class MainGame {
    public static void main(String[] args) {
        Player p1 = new Player("Kata", 15);
        Player p2 = new Player("Cheda", 25);
        Player p3 = new Player("Victoria", 5);
        Player p4 = new Player("Sofia", 35);

        Verwaltung myGame = new Verwaltung();


        Team teamA = new Team("A");
        Team teamB = new Team("B");
        teamA.add(p1);
        teamA.add(p2);
        teamB.add(p3);
        teamB.add(p4);
        myGame.addTeam(teamA);
        myGame.addTeam(teamB);
        System.out.println("*********");

        System.out.println("-----PRINT-----");
        myGame.print();


        System.out.println("-----getPointsPerTeam-TEAM A-----");
        System.out.println(teamA.getPointsPerTeam());
        System.out.println();
        teamB.getPointsPerTeam();
        System.out.println();
        teamA.print();
        System.out.println();
        System.out.println("-----getPlayerById-----");
        System.out.println(myGame.getPlayerById(3));


    }
}
