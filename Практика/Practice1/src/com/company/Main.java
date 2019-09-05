package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	    Ball b1 = new Ball(2, 0.1);
        Ball b2 = new Ball(3.2, 0.4);
        Ball b3 = new Ball(1);
        b3.setPressure(4);
        System.out.println(b1);
        b1.getVolume();
        b2.getVolume();
        b3.getVolume();

        Book bo1 = new Book("Andromeda's nebula", 1958);
        Book bo2 = new Book("20,000 leagues under the sea", 1867);
        Book bo3 = new Book("War of worlds");
        bo3.setPubYear(1908);
        System.out.println(b1);
        bo1.ageOfBook();
        bo2.ageOfBook();
        bo3.ageOfBook();
    }
}
