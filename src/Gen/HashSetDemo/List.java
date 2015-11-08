package Gen.HashSetDemo;

import java.util.*;

/**
 * Created by IT_School on 08.11.2015.
 */
public class List {
    public static void main(String[] args) {
        java.util.List <String> myList = Arrays.asList("a1","a2", "c2", "c1", "b2");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

}
