package com.company;
import java.lang.*;

public class Book {
    private String title;
    private int pubYear;

    public Book()
    {
        title = "";
        pubYear = 0;
    }

    public Book(String t)
    {
        title = t;
        pubYear = 0;
    }

    public Book(String t, int y)
    {
        title = t;
        pubYear = y;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setPubYear(int y)
    {
        pubYear = y;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPubYear()
    {
        return pubYear;
    }

    public String toString()
    {
        return "Book: '" + this.title + "' - " + this.pubYear;
    }

    public void ageOfBook()
    {
        System.out.println("This book was published " + (2019 - this.pubYear) + " years ago");
    }
}
