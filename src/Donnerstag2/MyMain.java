package Donnerstag2;

import java.time.LocalDateTime;

public class MyMain {

    public static void main(String[] args) {

        Info<String> name = new Info<>("Max", 1);
        Info<Integer> age = new Info<>(30, 2);
        Info<String> adr = new Info<>("Graz", 2);
        Profil profil = new Profil(name, age, adr);
        Info<LocalDateTime>registration = new Info<>(LocalDateTime.now(),2);


        profil.print();
        System.out.println("----------------");
        System.out.println("Time: "+registration.getData());
        System.out.println("----------------");
        String number = "1024";
        int n = Integer.parseInt(number);
        System.out.println(number);

    }
}
