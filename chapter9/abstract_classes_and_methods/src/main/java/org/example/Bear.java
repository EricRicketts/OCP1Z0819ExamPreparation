package org.example;

public abstract class Bear {
    abstract CharSequence chew();
    private String pawSize;
    public Bear() {
        this.pawSize = "medium";
    }

    public String getPawSize() {
        return pawSize;
    }
}
