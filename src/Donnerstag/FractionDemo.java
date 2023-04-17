package Donnerstag;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 5);
        System.out.println(fr.doubleToDecimal());
        fr.print();
        Fraction fraction1 = new Fraction(1, 5);
        Fraction result = fr.multiplicate(fraction1);
        result.print();
        Fraction fraction2 = new Fraction(1, 5);
        fr.multiplicate(fraction1, fraction2).print();

    }
}
