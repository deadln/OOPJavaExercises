package com.company;
import java.lang.*;

public class Author {
    String name;
    String email;
    char sex;

    public Author(String n, String e, char m)
    {
        name = n;
        email = e;
        sex = m;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString()
    {
        return name + "(" + sex + ") at " + email;
    }
}
