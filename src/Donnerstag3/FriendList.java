package Donnerstag3;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class FriendList {
    private List<Friend> friends = new ArrayList<>();


    public void addFriend(Friend f) {

        friends.add(f);

    }

    public List<Friend> getFriends() {
        return friends;
    }


    public void print() {
        for (Friend f : friends) {
            System.out.println(f);

            //friends.forEach((f)->System.out.println(f);

        }
//        for (int i = 0; i < friends.size(); i++) {
//            System.out.println(friends.get(i));
//        }
    }

    public ArrayList<Friend> friendsFrom(String city) {
        ArrayList<Friend> result = new ArrayList<>();

        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {//friends[i]
                result.add(friends.get(i));
            }
        }

        return result;
    }

    public ArrayList<Friend> friendsAbroad(String homecountry) {
        ArrayList<Friend> myresult = new ArrayList<>();

        for (int i = 0; i < friends.size(); i++) {
            if (!friends.get(i).getCountry().equals(homecountry)) {//friends[i]
                myresult.add(friends.get(i));
            }
        }

        return myresult;
    }

    public void print(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);

        }

    }
    public Friend findOldestFriend(){
        int year = Year.now().getValue();
        Friend oldestFriend = friends.get(0);
        int howLong= year-friends.get(0).getKnowSince();
        for (int i = 0; i < friends.size(); i++) {
            if ((year - friends.get(i).getKnowSince())>howLong){
                howLong=year-friends.get(i).getKnowSince();
                oldestFriend=friends.get(i);
            }

        }return oldestFriend;
    }

    public void removeFriend(Friend f) {

        friends.remove(f);

    }

}