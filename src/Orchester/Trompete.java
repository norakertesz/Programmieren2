package Orchester;

public class Trompete extends Instrumente {

    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }
    @Override
    public int play(){
        System.out.println("Trompete wird gespielt");
        return getLautstaerke();
    }

}
