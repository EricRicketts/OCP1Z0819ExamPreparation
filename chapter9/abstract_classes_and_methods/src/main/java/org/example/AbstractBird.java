package org.example;

public abstract class AbstractBird {
    public abstract String getName();
    public String returnName() {
        return this.getName();
    }
}
