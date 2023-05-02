package Animal;

public abstract class Animal {
    protected String name;
    protected int anzahlBeine;
    protected String augenFarbe;

    public Animal(String name, int anzahlBeine, String augenFarbe) {
        this.name = name;
        this.anzahlBeine = anzahlBeine;
        this.augenFarbe = augenFarbe;
    }

    public void printAnimalDescription(){
        System.out.println(name+" Beine:"+anzahlBeine+" Augenfarbe:"+augenFarbe);
    }

    public abstract void move(int meters);

    public abstract void makingNoise(String withComment);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    public String getAugenFarbe() {
        return augenFarbe;
    }

    public void setAugenFarbe(String augenFarbe) {
        this.augenFarbe = augenFarbe;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", anzahlBeine=" + anzahlBeine +
                ", augenFarbe='" + augenFarbe + '\'' +
                '}';
    }
}
