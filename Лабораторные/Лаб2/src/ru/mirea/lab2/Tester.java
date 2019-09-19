package ru.mirea.lab2;

import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        double a;
        RTriangle t1 = new RTriangle(2,3);
        System.out.println("Площадь треугольника = " + t1.getArea() + " см\n");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону треугольника a ");
        a = in.nextDouble();
        t1.setA(a);
        System.out.println("Площадь треугольника = " + t1.getArea() + " см\n");
    }
}
