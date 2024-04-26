package Stream_API;

import java.util.Arrays;

public class Sort_int_Array_Boxing2 {

    public static void main(String[] args) {
        int[] numbers = {10, 6, 30, 78, 90};

        // Sorting using Stream API
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();

        // Print the sorted array
      // Arrays.stream(sortedNumbers).forEach(System.out::println);
               //OR

        
       for (int  num : sortedNumbers ){
           System.out.println(num);


       }
    }
}
