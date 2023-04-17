package Donnerstag5;

import Donnerstag4.Eventtype;

public class Player {

    private int id;
    private static int counter = 0;
    private String name;
    private Team team;
    private int points;


    public Player(String name, int points) {
        this.name = name;
        this.id = counter++;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", point=" + points +
                '}';
    }


}
