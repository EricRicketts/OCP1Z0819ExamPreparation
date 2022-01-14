package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {
    public ArrayList<Animal> findWithPredicate(
            List<Animal> animals,
            Predicate<Animal> checker
    ) {
        ArrayList<Animal> foundAnimals = new ArrayList<>();
        for (Animal animal:animals) {
            if (checker.test(animal)) {
                foundAnimals.add(animal);
            }
        }
        return foundAnimals;
    }
}
