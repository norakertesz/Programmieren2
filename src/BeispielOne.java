public class BeispielOne {

    public static void main(String[] args) {
        Class c = new Class("programmieren2", 35, 15, 0);
        System.out.println(c.getName() + " " + c.maxCapacityReached());
        c.setName("Programmieren2");
        System.out.println(c.getName() + " " + c.maxCapacityReached());
        c.enroll();

        Student s = new Student("Nora", "N");
        System.out.println(s);
        s.enroll(c);
        s.printClasses();
        System.out.println("---------------------------");
        Class[] cs = s.getClasses();
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }
        System.out.println("---------------------------");



    }

}
