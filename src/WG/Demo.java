package WG;

public class Demo {
    public static void main(String[] args) {


        Student student = new Student("Kata", 30, "SWENG", 13);
        student.hallo();


        Lektor lektor= new Lektor("Prof",45,"FH Campus02","WebDev");
        Arbeitnehmer arbeitnehmer = new Arbeitnehmer("Josef",30,"OMV");
        lektor.hallo();
        System.out.println(student instanceof Person);
        Wohngemeinschaft wg1=new Wohngemeinschaft(new Adresse("Hauptplatz",99,"Graz",8010));
        wg1.add(lektor);
        wg1.add(student);
        System.out.println(wg1.getPersonen());




    }
}