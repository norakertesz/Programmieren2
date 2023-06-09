package Donnerstag3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainFriend {
    public static void main(String[] args) {
        Friend adam = new Friend("Adam", 30, "Graz", "Austria", 2016);
        Friend veronika = new Friend("Veronika", 31, "Wien", "Austria", 2015);
        Friend myla = new Friend("Myla", 38, "Prague", "Czech Republic", 2011);
        Friend kata = new Friend("Kata", 31, "Nagyatad", "Hungary", 2019);

        FriendList friendList = new FriendList();
        friendList.addFriend(adam);
        friendList.addFriend(veronika);
        friendList.addFriend(myla);
        friendList.addFriend(kata);

        friendList.print();
        System.out.println("--------------------");
        ArrayList<Friend> from = friendList.friendsFrom("Graz");

        friendList.print(from);

        System.out.println("--------------------");
        System.out.println(friendList.findOldestFriend());
        friendList.removeFriend(adam);
        System.out.println("--------------------");
        friendList.print();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        ArrayList<Friend> friendsfromsamecountry = friendList.friendsAbroad("Austria");
        friendList.print(friendsfromsamecountry);


        Map<String, Integer> phonenr = new HashMap<>();
        phonenr.put("Kata", 06503262541);
        phonenr.put("Veronika", 06775262441);
        System.out.println(phonenr.entrySet());
        System.out.println(phonenr.keySet());
        System.out.println(phonenr.values());
        System.out.println();

    }

}
