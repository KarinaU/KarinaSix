package Gen.HashSetDemo;

/**
 * Created by IT_School on 08.11.2015.
 */

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList <String> al = new java.util.LinkedList<String>();
        System.out.println("Initial size of all: " + al.size());

        al.add("C");
        al.add("G");
        al.add("D");
        al.add("F");
        al.add("B");
        al.add("E");
        al.addLast("Z");
        al.addFirst("A");

        al.add(1, "A2");

        System.out.println("Original contents of al: " + al);


        al.remove("F");
        al.remove(2);

        System.out.println("Contents of al after deletions: " + al);

        al.removeFirst();
        al.removeLast();

        System.out.println("al after deleting first and last: " + al);

        String val = al.get(2);
       // al.set() - ???????? ?? ???????????

    }
}
