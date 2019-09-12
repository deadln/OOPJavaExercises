package com.company;
import java.lang.*;

public class Author {
    String name;
    String email;
    boolean male;

    public Author(String n, String e, boolean m)
    {
        name = n;
        email = e;
        male = m;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return male;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString()
    {
        String res;
        res = name + " ";
        if(male)
            res += "(m) at " + email;
        else
            res += "(f) at " + email;
        return res;
    }
}
