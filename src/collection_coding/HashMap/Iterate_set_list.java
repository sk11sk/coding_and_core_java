package collection_coding.HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterate_set_list {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);

        System.out.println("===============================");

// iteration same for List and Set




        for (Integer s: set ){
            System.out.println(s);

        }
        System.out.println("===============================");
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }



}
