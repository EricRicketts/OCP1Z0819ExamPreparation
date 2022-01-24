package org.example;

public interface Soar {
    int MAX_HEIGHT = 10;
    boolean UNDERWATER = true;
    int fly(int speed);
    int takeoff(int takeoffSpeed);
    int double div(double diveSpeed);
}

