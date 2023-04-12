import java.util.Arrays;

public class Student {
    private String firstname;
    private String lastName;
    private Class[] classes;

    public Student(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.classes = new Class[3];
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Class[] getClasses() {
        return classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }
    public void enroll(Class c){
if(!c.maxCapacityReached()){
    for (int i = 0; i < classes.length; i++) {
        if(classes[i]==null){
            c.enroll();
            classes[i]=c;
            System.out.println("Kurs angemeldet");
            break;
        }else{
            System.out.println("Keine Anmeldung mehr möglich");
        }
    }
}

    }

    public void printClasses(){
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }


}
