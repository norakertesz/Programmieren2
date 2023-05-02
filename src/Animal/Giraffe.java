package Animal;

public class Giraffe extends Animal{



    protected int anzahlFlecken;

    public Giraffe(String name, int anzahlBeine, String augenFarbe) {
        super(name, anzahlBeine, augenFarbe);
        anzahlFlecken=40;//die typische Giraffe hat 40 Flecken
    }

    public Giraffe(String name, int anzahlBeine, String augenFarbe, int anzahlFlecken) {
        super(name, anzahlBeine, augenFarbe);
        this.anzahlFlecken = anzahlFlecken;
    }

    public void presentiertFlecken(){
        System.out.println("Giraffe "+name+" hat "+anzahlFlecken+" Flecken.");
    }



    @Override
    public void move(int meters) {
        System.out.println("Giraffe "+name+" stolziert "+meters+" weit.");
    }

    @Override
    public void makingNoise(String withComment) {
        System.out.println("Schmatz schmatz: "+ withComment);
    }
}
