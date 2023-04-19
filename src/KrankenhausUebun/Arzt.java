package KrankenhausUebun;

public class Arzt {
    private String name;
    private double gehalt;

    public Arzt(String name, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public double getGehalt() {
        return gehalt;
    }
}
