package Donnerstag5;

import Donnerstag4.Eventtype;

public class Player {
    private int id;
    private static int counter=0;
    private String name;
    private Team team;
    private int point;


    public Player(String name, Team team, int point) {
        this.name = name;
        this.team = team;
        this.point=point;
        this.id=counter++;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team=" + team +
                ", point=" + point +
                '}';
    }




}
