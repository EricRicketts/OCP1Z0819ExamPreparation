package org.example;

import java.util.function.Supplier;

public class SupplySpecies {
    public String supplySingleSpecies(Supplier<String> supplier) {
        return  supplier.get();
    }
}
