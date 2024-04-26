package Arrays;

public class MIN_element_1_2_3 {
    public static void main(String[] args) {
        int [] arr = {10,30,60,70,40,20,15,10,5,70,70,60,40,60,60,15,5};

        int min = Integer.MAX_VALUE; // max value possible in  integer // 2147483647

        for (int i = 0; i< arr.length; i++){
            if (arr[i]<min){

                min = arr[i];

            }

        }
        System.out.println(min);

        int second_min = Integer.MAX_VALUE;

        for (int i = 0; i< arr.length; i++){
            if (arr[i] < second_min & arr[i] != min) {

                second_min = arr[i];

            }

        }
        System.out.println(second_min);

        int third_min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]<third_min & arr[i] !=second_min & arr[i]!=min){

                third_min = arr[i];

            }

        }
        System.out.println(third_min);
        System.out.println(Integer.MAX_VALUE);
    }
}
