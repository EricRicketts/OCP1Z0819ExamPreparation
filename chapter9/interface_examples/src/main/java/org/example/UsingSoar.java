package org.example;

public class UsingSoar implements Soar {

    public int fly(int speed) {
        return speed;
    }

    public int takeoff(int takeoffSpeed) {
        return takeoffSpeed;
    }

    public double dive(double diveSpeed) {
        return diveSpeed;
    }
}
