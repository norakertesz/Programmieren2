public class Class {


    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;


    public Class(String name, int hours, int maxCapacity, int enrolledStudents) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity=maxCapacity;
        enrolledStudents=0;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    public void enroll() {
        if (maxCapacityReached()) {
            System.out.println("Kurs ist voll");
        } else {
            System.out.println("Angemeldet");
            enrolledStudents++;
        }
    }


    public boolean maxCapacityReached(){
       return enrolledStudents>=maxCapacity;
        }
    }



