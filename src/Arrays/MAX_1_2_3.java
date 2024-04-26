package Arrays;

public class MAX_1_2_3 {
    public static void main(String[] args) {

        int [] arr  = {10,30,60,70,40,20,15,10,5,70,70,60,40,60,60};

        int max = Integer.MIN_VALUE; //  least possible min value of integer //-2147483648

        for (int i  =0; i<arr.length;i++){

            if (arr[i]>max){

                max= arr[i];
            }
        }
        System.out.println("max : "+ max);


        int Second_max = Integer.MIN_VALUE; //  least possible min value of integer

        for (int i  =0; i<arr.length;i++){

            if (arr[i]>Second_max & arr[i]!=max){

                Second_max= arr[i];
            }
        }
        System.out.println("Second_max : "+ Second_max);

        int third_max = Integer.MIN_VALUE; //  least possible min value of integer

        for (int i  =0; i<arr.length;i++){

            if (arr[i] > third_max &  arr[i]!= Second_max & arr[i] !=max ) {

                third_max= arr[i];
            }
        }
        System.out.println("third_max : "+ third_max);


    }
}



//
//
//int min = Integer.MAX_VALUE;
//int second_min = Integer.MAX_VALUE;
//int third_min = Integer.MAX_VALUE;
//int fourth_min = Integer.MAX_VALUE;
//
//        for(int i  =0;i<x.length;i++){
//
//        if (x[i]<min | x[i]<second_min | x[i] < third_min){
//fourth_min=third_min;
//third_min = second_min;
//second_min = min;
//min = x[i];
//
//        }
//
//        }
//
//        System.out.println(min);
//        System.out.println(second_min);
//        System.out.println(third_min);
//        System.out.println(fourth_min);
