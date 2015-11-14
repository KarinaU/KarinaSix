package Lesson17;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by IT_School on 14.11.2015.
 */
public class Test {
    public  static void main(String[] args) {
        ArrayList<Person> pr1 = new ArrayList<>();

        pr1.add(new Person("Jonh", 22));
        pr1.add(new Person("Tom", 25));
        System.out.println(pr1);

        Set<Person> st = new TreeSet<>();

        st.add(new Person("Jonh", 22));
        st.add(new Person("Tom", 25));
        System.out.println(st);

    }
}

