package Orchester2;

public class Gitarre extends Instrumente {
    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }
    public int play(){
        System.out.println("Gitarre wird gespielt");
        return getLautstaerke();
    }

}
