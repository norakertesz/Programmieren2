package Hase;

public class Weihnachtshase extends Hase {
    public Weihnachtshase(String name, int alter, int c) {
        super(name, alter,c);
    }

    public void verteileGeschenke() {
        System.out.println(getName() + " sagt: " + "Du bekommst nichts!");
    }

    @Override
    public void party(String drink, String cake){
        System.out.println("Weihnachtshase "+ getName() +" bringt ganz viele Geschenke zur Party.");
    }

}
