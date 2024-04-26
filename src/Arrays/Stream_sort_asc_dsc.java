package Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class Stream_sort_asc_dsc {



    public static void main(String[] args) {
        int[] arr = {40, 50, 80, 20,30,30, 10};

//        Arrays.stream(arr)
//                .sorted()
//               .forEach(System.out::println);


        List<Integer> collect = Arrays.stream(arr)
                .sorted()
                .boxed()
                .collect(Collectors.toList());


        System.out.println(collect);

        collect.forEach(System.out::println);

        System.out.println("=================");

        List<Integer> list = Arrays.asList(40, 50, 80, 20, 10);

        // Sorting the list using streams
//        List<Integer> collect1 = list.stream()
//                .sorted()
//                .collect(Collectors.toList());
       // System.out.println(collect1);



         list.stream()
                .sorted()
                .forEach(System.out::println);




    }
}



