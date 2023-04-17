package Donnerstag5;

import Donnerstag3.Friend;
import Donnerstag4.Event;

import java.util.ArrayList;

public class Verwaltung {
    ArrayList<Player> players = new ArrayList<>();

    public void print() {
        for (Player p : players) {
            System.out.println(p);
        }
    }
    public void addPlayer(Player p) {
        players.add(p);
    }
    public void removePlayer(Player p) {
        players.remove(p);
    }
    public Player getPlayerById(int id){

            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getId()==id) {//friends[i]
                    return players.get(i);
                }
            }
            return null;
        }
    public int getPointsPerTeam(Team team){

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getPoint()) {//friends[i]

            }
        }

    }

    }



    }



