package Montag;

import java.util.HashMap;

public class Mitzaehlen {

    private String text;
    private HashMap<String, Integer> wodCount = new HashMap<>();

    public Mitzaehlen(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public HashMap<String, Integer> getWodCount() {
        return wodCount;
    }

    public void convertTextToMap() {
        //text.split();
        //String[] durchlaufen
        //map.put(String[i], map.get(String[i]+1));

        removePunctuation();
        System.out.println(text);
        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length; i++) {
            if (wodCount.get(splitText[i]) == null) {
                wodCount.put(splitText[i], 0);
            }
            wodCount.put(splitText[i], wodCount.get(splitText[i]) + 1);
        }


    }

    private void removePunctuation() {

        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || Character.isLetter(text.charAt(i))) {
                newText += text.charAt(i);
            } }
            this.text = newText;


    }


}
