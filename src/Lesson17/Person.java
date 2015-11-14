package Lesson17;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IT_School on 14.11.2015.
 */
public class Person implements Comparable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return this.age -((Person)o).age ;

        //return this.name.compareTo((Person)o).name;
    }
    }
