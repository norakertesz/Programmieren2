package Programmieren2in2;

public class IntTest {
    public static void main(String[] args) {

        int a1=12;
        Integer a2= new Integer(13);
        Integer a3=14;
        System.out.println(a1);
        System.out.println(a2);

        String test="55";
        System.out.println(test+"5");
        System.out.println(test+5);
        int testZahl= Integer.parseInt(test);
        System.out.println(testZahl+5);
        //3 Objekte und 6 Referenzen
        Integer i1=12;
        Integer i2=24;
        Integer i3=36;

        Integer i4 = i1;
        Integer i5 = i2;
        Integer i6 = i3;
        System.out.println("fertig");

//https://pythontutor.com/visualize.html#mode=display


    }
}
