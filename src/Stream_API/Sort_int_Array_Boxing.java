package Stream_API;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Sort_int_Array_Boxing{

    public static void main(String[] args) {



          int[] numbers = {10, 6, 30, 78, 90};

        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//ascending order
        List<Integer> collect = numbersList.stream().sorted().collect(Collectors.toList());

        //descending order

      //  List<Integer> collect = numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }

}
