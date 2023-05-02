package Orchester;

public class Klarinette extends Instrumente {

    public Klarinette(int lautstaerke) {
        super(lautstaerke);
    }
    @Override
    public int play(){
        System.out.println("Klarinette wird gespielt");
        return getLautstaerke();
    }

}
