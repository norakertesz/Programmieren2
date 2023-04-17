package Donnerstag4;

import Donnerstag3.Friend;

import java.util.ArrayList;
import java.util.Iterator;


public class EventCalendar {
    ArrayList<Event> events = new ArrayList<>();

    public void add(Event event) {
        events.add(event);
    }

    public void print(ArrayList<Event> events) {
        for (Event e : events) {
            System.out.println(e);
        }
    }

    public void print() {
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public Event getByTitle(String title) {

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getTitel().equals(title)) {//friends[i]
                return events.get(i);
            }
        }
        return null;
    }

    public ArrayList<Event> getByType(Eventtype type) {

        ArrayList<Event> result = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEvent().equals(type)) {//friends[i]
                result.add(events.get(i));
            }
        }

        return result;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> result = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getOrt().equals(ort)) {//friends[i]
                result.add(events.get(i));
            }
        }

        return result;
    }

    public Event getMostExpensive() {
        double price = 0.0;
        Event result = events.get(0);
        for (Event e : events) {
            if (e.getPreis() > price) {
                price = e.getPreis();
                result = e;
            }
        }


//        for (int i = 0; i < events.size(); i++) {
//            if(events.get(i).getPreis()>price){
//                price=events.get(i).getPreis();
//                result=events.get(i);
//            }
//        }return result;
//

        return result;
    }

    public void removeExpensive(double limit) {
        Iterator<Event> it = events.iterator();

        while (it.hasNext()) {
            Event event = it.next();
            if (event.getPreis() > limit) {
                it.remove();
            }
        }
    }


}

