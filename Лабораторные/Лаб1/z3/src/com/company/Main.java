package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        double g = 0;
        for (double i = 1;i <= 10; i += 1)
        {
            g += 1 / i;
            System.out.println(g);
        }
    }
}
