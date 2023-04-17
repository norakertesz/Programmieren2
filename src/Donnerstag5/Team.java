package Donnerstag5;

import Donnerstag4.Event;

import java.util.ArrayList;


public class Team {
    private ArrayList<Player> players = new ArrayList<>();
    private String name;

    public Team(String name) {

        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +

                ", name='" + name + '\'' + ", points" + getPointsPerTeam() +
                '}';
    }

    public void add(Player p) {
        players.add(p);
    }

    public void print() {
        players.forEach((p) -> System.out.println(p));
        System.out.println();
    }

    public int getPointsPerTeam() {
        int max = 0;
        for (Player p : players) {

            max += p.getPoints();


        }
        return max;
    }
}






