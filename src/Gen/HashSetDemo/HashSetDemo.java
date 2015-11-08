package Gen.HashSetDemo;

/**
 * Created by IT_School on 08.11.2015.
 */

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet <String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("B");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);



    LinkedHashSet <String> lhs = new LinkedHashSet<String>();
    lhs.add("B");
    lhs.add("A");
    lhs.add("D");
    lhs.add("B");
    lhs.add("C");
    lhs.add("F");
    System.out.println(lhs);


        TreeSet <String> ths = new TreeSet<String>();
        ths.add("B");
        ths.add("A");
        ths.add("D");
        ths.add("B");
        ths.add("C");
        ths.add("F");
        System.out.println(ths);

}
}