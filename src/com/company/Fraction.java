package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
    }

    public Fraction()
    {
        numerator = 0;
        denominator = 0;
    }


    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    public Fraction subtract(Fraction other)
    {
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }
    public Fraction multiply(Fraction other)
    {
        int n = this.numerator*other.numerator;
        int d = this.denominator * other.denominator;

        Fraction result = new Fraction(n,d);
        return result;
    }

    public String toString(){
        String s = numerator + "/" + denominator;
        return s;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(4,5);
        Fraction f6 = new Fraction(6,9);
        Fraction f9 = new Fraction(9,6);

        Fraction f3 = f1.add(f2);
        System.out.println("3/4 + 4/5 = " + f3);


		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

        Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);

        Fraction f8 = f6.add(f9);			
        System.out.println("6/9 + 9/6 = " + f8);



    }

}