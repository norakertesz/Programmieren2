package Programmieren2in2;

public class Beagle extends Dog{
    public String lovedFood;

    public Beagle(String name, int age, String lovedFood) {
        super(name, age);
        this.lovedFood = lovedFood;
    }

    public void eatsLovedFood(){
        System.out.println(getName() + "(" + age  + ") isst " + lovedFood);
    }

    @Override //Etwas wirklich berücksichtigen soll - muss mit anderen Klasse(Methode bark()) passen...
    public void bark(String wuff){
        //super.bark(wuff);
        System.out.println(getName() + " bellt und jammert:" + wuff);
    }

}
