package com.company;
import java.lang.*;
import	java.util.Scanner;


public class TestAuthor {

    public static void runTest()
    {
        String name, email,s;
        char sex;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя автора");
        name = in.nextLine();
        System.out.println("Введите электронную почту автора");
        email = in.nextLine();
        System.out.println("Введите пол автора");
        s = in.nextLine();
        sex = s.charAt(0);

        Author gh = new Author(name, email, sex);
        System.out.println(gh);
        gh.setEmail("luke12skywalker@gmail.com");
        System.out.println(gh);
    }
}
