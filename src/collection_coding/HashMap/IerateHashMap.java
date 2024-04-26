package collection_coding.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IerateHashMap {

    public static void main(String[] args) {
        Map<Integer , String >  map =  new HashMap<>();

        map.put(1,"shaurabh");
        map.put(2,"singh");
        map.put(3,"gaurav");
        map.put(4,"singh");

        System.out.println(map);

        // Iterate

        System.out.println("=====================================");

     //   Set<Integer> integers = map.keySet();

        for(Integer  i :map.keySet()){
            System.out.println( i + " = " +map.get(i));

        }

        System.out.println("=====================================");

      //  Set<Map.Entry<Integer, String>> entries = map.entrySet();

            for (Map.Entry<Integer, String>  entries: map.entrySet()){
                Integer key = entries.getKey();
                String value = entries.getValue();
                System.out.println(key + "  =  " + value );


            }

    }
}
