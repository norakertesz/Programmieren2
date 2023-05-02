package Orchester2;

public class Geige extends Instrumente {

    public Geige(int lautstaerke) {
        super(lautstaerke);
    }
@Override
    public int play(){
        System.out.println("Geige wird gestrichen");
        return getLautstaerke();
    }


}
