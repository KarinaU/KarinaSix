package Lesson17;

/**
 * Created by IT_School on 14.11.2015.
 */

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("C");
        al.add("F");
        al.add("D");
        al.add("A");
        al.add("B");
        al.add("E");

        System.out.println("Original");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Modified");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        System.out.println("Modified list");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }



}
