package Donnerstag4;

import java.util.ArrayList;

public class Event {
    private Eventtype event;
    private String titel;
    private String ort;
    private double Preis;


    public Event(Eventtype event, String titel, String ort, double preis) {
        this.event = event;
        this.titel = titel;
        this.ort = ort;
        Preis = preis;
    }

    public Eventtype getEvent() {
        return event;
    }

    public void setEvent(Eventtype event) {
        this.event = event;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "event=" + event +
                ", titel='" + titel + '\'' +
                ", ort='" + ort + '\'' +
                ", Preis=" + Preis +
                '}';
    }

}
