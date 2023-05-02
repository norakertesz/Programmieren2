package Orchester;

public class Instrumente {
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
    public int play(){
        return lautstaerke;
    }

    @Override
    public String toString() {
        return "Instrumente{" +
                "lautstaerke=" + lautstaerke +
                '}';
    }
}
