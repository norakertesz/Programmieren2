package Orchester2;

public abstract class Instrumente {
    private int lautstaerke;

    public Instrumente(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }
    public abstract int play();

    @Override
    public String toString() {
        return "Instrumente{" +
                "lautstaerke=" + lautstaerke +
                '}';
    }
}
