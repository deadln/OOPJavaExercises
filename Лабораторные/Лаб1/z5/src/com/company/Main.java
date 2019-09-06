package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static int fact(int x)
    {
        if(x < 0)
            return 0;
        if(x == 0)
            return 1;
        int f = 1;
        for(int i = 1; i <= x;i++)
            f *= i;
        return f;
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.println(fact(n));
    }
}
