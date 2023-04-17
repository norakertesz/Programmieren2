package Donnerstag;


public class Fraction {
    private int numerator;//zaehler
    private int denominator; //nenner

    public Fraction(int numerator, int denominator) { //Konstruktor
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double doubleToDecimal() {
        return (double) numerator / denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction multiplicate(Fraction b2) {
        return new Fraction(b2.getNumerator() * this.numerator, b2.getDenominator() * this.denominator);
    }

    public Fraction multiplicate(Fraction b2, Fraction b3) {
       return this.multiplicate(b2).multiplicate(b3);

    }

}

