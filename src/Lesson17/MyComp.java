package Lesson17;

import java.util.*;

/**
 * Created by IT_School on 14.11.2015.
 */
 class MyComp implements Comparator <String> {
    @Override
    public int compare(String a, String b) {
        String aStr,bStr;

        aStr = a;
        bStr = b;

        return bStr.compareTo(aStr);
    }
}

class CompDemo{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("D");
        ts.add("B");
        ts.add("E");
        ts.add("F");

        for (String element : ts)
            System.out.println(element + " ");
        System.out.println();
    }
}
