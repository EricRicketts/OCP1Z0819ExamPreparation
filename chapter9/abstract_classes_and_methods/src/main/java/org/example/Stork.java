package org.example;

public class Stork extends Bird {
    public Stork (String name) {
        super(name);
    }

    public String getName() {
        return super.getName() + " " + "Stork";
    }
}
