package MY_INTERVIEW_QUESTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A {


    public static void main(String[] args) {

//        int sum = IntStream.rangeClosed(1, 10).filter(e -> e % 2 == 0).sum();
//        System.out.println(sum);

        List<Integer> list = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> collect = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        int sum = collect.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);



    }
}
