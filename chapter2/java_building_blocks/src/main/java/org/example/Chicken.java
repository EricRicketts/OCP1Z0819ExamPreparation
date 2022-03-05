package org.example;

public class Chicken {
    private int numberOfEggs = 12;
    String name;

    public Chicken() {
        this.name = "Duke";
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }
}
