package Donnerstag2;

public class Profil {
    private Info name;

    private Info age;

    private Info addr;

    public Profil(Info name, Info age, Info addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    private String checkSecurityLevel(Info info) {
        switch (info.getSecurityLevel()) {
            case 1:
                return "Zugriff gestartet " + info.getData();
            case 2:
                return "Zugriff nicht gestartet.";

            case 3:
                return "Nicht erfasst.";
            default: return "Ungültiger status.";
        }
    }
public void print(){
    System.out.println("Name: ");
    System.out.println("\t"+checkSecurityLevel(name));

    System.out.println("Age: ");
    System.out.println("\t"+checkSecurityLevel(age));

    System.out.println("Addresse: ");
    System.out.println("\t"+checkSecurityLevel(addr));

}




}
