package WG;

public class Student extends Person {
    private String studium;
    private int matrikelnummer;


    public Student(String name, int alter, String studium, int matrikelnummer) {
        super(name, alter);
        this.studium = studium;
        this.matrikelnummer = matrikelnummer;
    }
public void hallo(){
        super.hallo();
    System.out.println("Hallo!!!");
}

}
