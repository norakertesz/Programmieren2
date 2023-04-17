package Donnerstag5;


import java.util.ArrayList;

public class Verwaltung {
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();

    public void print() {
        for (Team t : teams) {
            System.out.print(t);
            t.print();
        }
        System.out.println();
    }

    public void addTeam(Team t) {
        teams.add(t);
    }

    public void removeTeam(Team t) {
        teams.remove(t);
    }


    public Player getPlayerById(int id) {
        for (Team t : teams) {
            for (Player p : t.getPlayers()){

                if (p.getId() ==id) {
                   return p;
                }

            }
        }

        return null;
    }

    public Team getWinner() {
        Team winner = null;
        int points = 0;
        for (Team t : teams
        ) {
            if (t.getPointsPerTeam() > points) {
                winner = t;
                points = t.getPointsPerTeam();
            }

        }

        return winner;
    }

    public Player getBestPlayer() {
        Player best = null;
        int points = 0;
        for (Team t :teams) {
            for (Player p:t.getPlayers()){
                if(p.getPoints()>points){
                    best=p;
                    points=p.getPoints();

                }

            }
        }

        return best;
    }


}




