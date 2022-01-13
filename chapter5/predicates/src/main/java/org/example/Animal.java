package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        this.species = speciesName;
        this.canHop = hopper;
        this.canSwim = swimmer;
    }

    public boolean canHop() { return this.canHop; }
    public boolean canSwim() { return this.canSwim; }
    public String toString() { return this.species; }


}
