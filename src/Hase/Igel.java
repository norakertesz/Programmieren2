package Hase;

public class Igel implements GoesToParty {

    @Override
    public void party(String drink, String cake) {
        System.out.println("Igel geht zur Party und sit ganz vorsichtig um Niemanden zu stechen und isst "+cake+".");
    }
}
