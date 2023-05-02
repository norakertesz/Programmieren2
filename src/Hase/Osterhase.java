package Hase;

public class Osterhase extends Hase{

    public Osterhase(String name, int alter, int c) {
        super(name,alter,c);
    }

    public void versteckeOstereier(){
        System.out.println(getName() + " sagt: "+"Such die Eier!!!!!");
    }
    @Override
    public void hoppeln(){
        System.out.println(getName() + " hopi hopp hoppelt.");
    }
}
