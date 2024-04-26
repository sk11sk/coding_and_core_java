package Arrays;

import java.util.Arrays;

public class duplicates_alternate {
// 2 pointers method
    public static void main(String[] args) {

        int [] arr = {10, 30, 20, 20,0,0, 10,20, 40, 30, 80, 40,90};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] == arr[j] ) {

                  arr[j]=0;


                     }
                }

            }

        for (int i : arr){
            if (i!=0){

                System.out.println(i);

            }


        }

    }
}




