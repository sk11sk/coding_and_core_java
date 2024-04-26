package collection_coding.HashMap;


import java.util.HashMap;
import java.util.Map;

public class Integer_output_HashMap {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,40);
        map.put(1, 10);

        Integer put1 = map.put(2, 20);
        map.put(2,80);

        Integer output = map.put(1, 30);

        System.out.println(put1);
        System.out.println(output);
        System.out.println(map);
        System.out.println(map.get(1));

    }

}