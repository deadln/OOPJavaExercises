package com.company;
import java.lang.*;

public class Ball {
    private double pressure;
    private double radius;

    public Ball()
    {
        pressure = 0;
        radius = 1;
    }

    public Ball(double p, double r)
    {
        pressure = p;
        radius = r;
    }

    public Ball(double r)
    {
        pressure = 0;
        radius = r;
    }

    public void setPressure(double p)
    {
        pressure = p;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getPressure()
    {
        return pressure;
    }

    public double getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "Ball: " + this.radius + " m, " + this.pressure + " Pa";
    }

    public void getVolume()
    {
        System.out.println("The volume of ball is " + 4 / 3 * Math.PI * Math.pow(this.radius, 3));
    }
}
