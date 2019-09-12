package com.company;
import java.lang.*;


public class TestAuthor {

    public static void runTest()
    {
        Author gh = new Author("Herbert Schildt", "h.schildt@gmail.com", true);
        System.out.println(gh);
        gh.setEmail("luke12skywalker@gmail.com");
        System.out.println(gh);
    }
}
