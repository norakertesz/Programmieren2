package Orchester;

public class Gitarre extends Instrumente{
    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play(){
        System.out.println("Gitarre wird gespielt");
        return getLautstaerke();
    }

}
