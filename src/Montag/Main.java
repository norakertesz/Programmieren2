package Montag;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String str = "Hallo Welt!";
        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        String str2 = "Hallo Welt!, Ich gehe gleich 1 nach Hause!";
        Mitzaehlen wordCount = new Mitzaehlen(str2);
        wordCount.convertTextToMap();
        System.out.println(wordCount.getWodCount());

        }
}
