package Montag2;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerListe {

    private HashMap<String, Integer> player = new HashMap<>();
    private ArrayList<Player> players = new ArrayList<>();

    public void addOrUpdate(Player p, int points){
        player.put(String.valueOf(p), points);

    }

}
