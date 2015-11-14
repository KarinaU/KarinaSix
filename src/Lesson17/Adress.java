package Lesson17;

/**
 * Created by IT_School on 14.11.2015.
 */

import java.util.*;

public class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Adress(String n, String s, String c, String st, String cd ){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString(){
        return  name + " " + street + " " + city + " " + state + "\n " + code;
    }
}

class MailList{
    public static void main(String[] args) {
        List <Adress> ml = new LinkedList();
        ml.add(new Adress("Jonh", "dyjd", "hfh", "jsr", "dfe"));
        ml.add(new Adress("A", "dB", "C", "D", "E"));
        ml.add(new Adress("A1", "2", "3", "D4", "E5"));

        for(Adress element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }
}