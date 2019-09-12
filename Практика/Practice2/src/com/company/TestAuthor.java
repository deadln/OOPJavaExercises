package com.company;
import java.lang.*;
import	java.util.Scanner;


public class TestAuthor {

    public static void runTest()
    {
        String name, email;
        boolean male;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        email = in.nextLine();
        male = in.nextBoolean();

        Author gh = new Author(name, email, male);
        System.out.println(gh);
        gh.setEmail("luke12skywalker@gmail.com");
        System.out.println(gh);
    }
}
