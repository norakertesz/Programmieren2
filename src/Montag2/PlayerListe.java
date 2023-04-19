package Montag2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayerListe {

    Map<Player, Integer> player = new HashMap<>();


    public void addOrUpdate(Player p, int points) {
        Integer po = player.get(p);
        if (po == null) {
            player.put(p, points);
        } else {
            player.put(p, player.get(p) + points);
        }

    }

    public Map<Player, Integer> getPlayer() {
        return player;
    }

    public ArrayList<Player> getPlayerWithPoints(int points) {
        ArrayList<Player> result = new ArrayList<>();
        for (Map.Entry<Player, Integer> entry : player.entrySet()) {//MAP<KEY=Player=p1, VALUE=INTEGER=points>
            if (entry.getValue() > points) {
                result.add(entry.getKey());
            }

        }
        //ZWEITE MOEGLICHKEIT
//        for(Player p:player.keySet()){
//            if(player.get(p)>points){
//                result.add(p);
//            }
//
//        }
        return result;
    }
}


