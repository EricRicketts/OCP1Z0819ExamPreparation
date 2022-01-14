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
    SupplySpecies supplySpecies;
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
        supplySpecies = new SupplySpecies();
    }

    @Test
    public void testPredicateLambda() {
       ArrayList<Animal> results = predicateSearch.findWithPredicate(animals, a -> a.canHop());
       assertEquals(4, results.size());
    }

    @Test
    public void testConsumerLambda() {
        ArrayList<String> results = new ArrayList<>();
        String[] source = {"foo", "bar", "fizz", "buzz"};
        Consumer<String> consumer = s -> results.add(s);
        for (String s:source) {
            consumer.accept(s);
        }
        assertArrayEquals(source, results.toArray());
    }

    @Test
    public void testSupplierLambda() {
        Supplier<String> firstSpecies = () -> animals.get(0).toString();
        String firstAnimal = supplySpecies.supplySingleSpecies(firstSpecies);

        assertEquals("guppy", firstAnimal);
    }

    @Test
    public void testComparatorLambda() {
        List<Integer> expected = Arrays.asList(-1, 1, -1);
        ArrayList<Integer> results = new ArrayList<>();
        Comparator<Integer> ints = (i1, i2) -> i1.compareTo(i2);
        int[] data = {-1, 3, -5, 5};
        for (int i = 0; i < data.length - 1; i++) {
            results.add(ints.compare(data[i], data[i+1]));
        }
        assertEquals(expected, results);
    }
}
