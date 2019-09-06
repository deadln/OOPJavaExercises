package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[25];
        for(int i = 0; i < 20; i++)
        {
            a[i] = (int)(Math.random() * 50 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int b;
        for(int i = 0;i < 20;i++)
        {
            for(int j = i + 1; j < 20;j++)
            {
                if(a[j] < a[i])
                {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for(int i = 0; i < 20; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
