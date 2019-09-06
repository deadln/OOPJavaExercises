package com.company;
import java.lang.*;
import	java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a[] = new int[100];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0;i < n;i++)
        {
            a[i] = in.nextInt();
        }

        int s = 0,i;
        for (i = 0;i < n;i++)
        {
            s += a[i];
        }
        System.out.println(s);

        s = 0;
        i = 0;
        while(i < n)
        {
            s += a[i];
            i++;
        }
        System.out.println(s);

        s = 0;
        i = 0;
        do {
            s += a[i];
            i++;
        }
        while(i < n);
        System.out.println(s);
    }
}
