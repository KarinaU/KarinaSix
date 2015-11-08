package Gen.HashSetDemo;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by IT_School on 08.11.2015.
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<String>();
        qu.offer("Oklahoma");
        qu.offer("Indiana");
        qu.offer("Georgia");
        qu.offer("Texas");
        while (qu.size()> 0)
            System.out.print(qu.remove() + " ");
    }
    }