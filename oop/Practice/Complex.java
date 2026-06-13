package oop.Practice;

import java.util.Scanner;

public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

    public void display() {
       System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of 1st complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of 1st comples number: ");
        double imag1 = sc.nextDouble();

        System.out.print("Enter real part of 2nd complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of 2nd comples number: ");
        double imag2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        prod.display();

        sc.close();
    }
}

