package Animal;

public class Papagei extends Animal{


    public Papagei(String name, int anzahlBeine, String augenFarbe) {
        super(name, anzahlBeine, augenFarbe);
    }

    @Override
    public void move(int meters) {
        System.out.println("Papagei "+name+" fliegt "+meters+" weit.");
    }

    @Override
    public void makingNoise(String withComment) {
        System.out.println("Papagei "+name+" spricht "+withComment);
    }
}
