package Programmieren2in2;

public class Dog {
    public static String latinName="Canis lupus familiaris"; //es verändert sich
    private String name;
    protected int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark(String wuff) {
        System.out.println(name + " bellt " + wuff);
    }

    //statische Methode darf auf lokale Var. und statische Attributen zugreifen
    public static void printLatinName(){
        String hans="Hansi liebt Hunde";
        System.out.println(hans);

        System.out.println(latinName);



    }

}
