package Stream_API;


import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map_VS_FlatMap {
    public static void main(String[] args) {




        List<Integer> list  = Arrays.asList(10,60,30,20);
        List<Integer> collect = list.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("==========================");





     List<List<Integer>> lists  = Arrays.asList(Arrays.asList(3,1,2,4),Arrays.asList(8,7,5,6));
       


//        List<Stream<Integer>> collect2 = lists.stream().map(e -> e.stream()).collect(Collectors.toList());
//        System.out.println(collect2);


        System.out.println("==========================");
       // List<Object> collect1 = lists.stream().flatMap(e->e.stream()).collect(Collectors.toList());
        List<Integer> collect1 = lists.stream().flatMap(e->e.stream()).map(e->e*e).collect(Collectors.toList());
        System.out.println(collect1);













//        List<List<Integer>> listss  = Arrays.asList(Arrays.asList(3,1,2,4),Arrays.asList(8,7,5,6));
//        List<Integer> collect2 = listss.stream().flatMap(e->e.stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(collect2);
//



    }

}
