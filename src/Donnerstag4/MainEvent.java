package Donnerstag4;

public class MainEvent {
    public static void main(String[] args) {

        Event e1 = new Event(Eventtype.KONZERT, "Maroon5", "Prague", 200.15);
        Event e2 = new Event(Eventtype.REISE, "GoHome", "Hungary", 1200.15);
        Event e3 = new Event(Eventtype.VORTRAG, "Csernus", "Wien", 50.15);
        Event e4 = new Event(Eventtype.KONZERT, "Maroon5", "Prague", 200.15);
        EventCalendar myCalendar = new EventCalendar();
        myCalendar.add(e1);
        myCalendar.add(e2);
        myCalendar.add(e3);
        myCalendar.add(e4);
        System.out.println("-----getByTitle-----");
        System.out.println(myCalendar.getByTitle("Maroon5"));

        System.out.println("");
        System.out.println("-----PRINT-----");
        myCalendar.print();


        System.out.println("");
        System.out.println("-----getByType-----");
        System.out.println(myCalendar.getByType(Eventtype.VORTRAG));

        System.out.println("");
        System.out.println("-----getByOrt-----");
        System.out.println(myCalendar.getByOrt("Wien"));

        System.out.println("");
        System.out.println("-----getMostExpensive-----");
        System.out.println(myCalendar.getMostExpensive());







    }
}
