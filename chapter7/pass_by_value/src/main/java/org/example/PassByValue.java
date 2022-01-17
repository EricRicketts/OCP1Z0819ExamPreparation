package org.example;

public class PassByValue {
    public void newNumber(int num) {
        num = 8;
    }

    public void speak(String s) {
        s = "Sparky";
    }

    public void speakAppend(StringBuilder s) {
        s.append("Webby");
    }

    public int increment(int number) {
        number++;
        return number;
    }
}
