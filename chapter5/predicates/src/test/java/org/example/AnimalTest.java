package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.*;
import static org.junit.jupiter.api.Assertions.*;


public class AnimalTest
{

    List<Animal> animals;
    PredicateSearch predicateSearch;
    @BeforeEach
    public void setUp() {
        animals = new ArrayList<>();
        animals.add(new Animal("guppy", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        animals.add(new Animal("mackerel", false, true));
        animals.add(new Animal("toad", true, true));
        animals.add(new Animal("wallaby", true, false));
        animals.add(new Animal("gorilla", false, false));

        predicateSearch = new PredicateSearch();
    }

    @Test
    public void testPredicateLambda() {
       ArrayList<Animal> results = predicateSearch.findWithPredicate(animals, a -> a.canHop());
       assertEquals(4, results.size());
    }
}
