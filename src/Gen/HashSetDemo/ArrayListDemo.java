package Gen.HashSetDemo;

/**
 * Created by IT_School on 08.11.2015.
 */

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of all: " + al.size());

        al.add("C");
        al.add("A");
        al.add("D");
        al.add("F");
        al.add("B");
        al.add("E");
        al.add(1, "A2");

        System.out.println("Size of all after adition: " + al.size());

        System.out.println("Contents of all: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("Size of all after deletions: " + al.size());
        System.out.println("Contents of all: " + al);

    }
}
