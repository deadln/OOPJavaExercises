package ru.mirea.lab2;

import java.lang.*;

public class RTriangle {
    private double a;
    private double b;
    private double c;

    public RTriangle(double a, double b) {
        this.a = a;
        this.b = b;
        c = Math.sqrt(a*a + b*b);
    }

    public void setA(double a) {
        this.a = a;
        c = Math.sqrt(a*a + b*b);
    }

    public void setB(double b) {
        this.b = b;
        c = Math.sqrt(a*a + b*b);
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString()
    {
        return "Right Triangle{a=" + a + ", b=" + b + ", c=" + c + "}";
    }

    public double getArea()
    {
        return a * b / 2;
    }
}
