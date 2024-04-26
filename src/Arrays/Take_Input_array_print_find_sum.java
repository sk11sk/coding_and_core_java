package Arrays;

import java.util.Scanner;

public class Take_Input_array_print_find_sum {

    public static void main(String[] args) {

        // taking array input

        Scanner scan = new Scanner (System.in);
        System.out.println("enter the size of an array");

        int n = scan.nextInt();
        int [] arr = new int [n];


        //using for loop

//        System.out.println("enter the elements  of  the  array");
//        Scanner elements  = new Scanner (System.in);
//
//
//        for (int i  = 0; i <n; i++){
//            arr[i] =  elements.nextInt();
//        }

        Scanner s =  new Scanner(System.in);

        System.out.println(" enter the elements ");

        int a  = 0;
        // using for each
        for (int l : arr){

            arr[a] = s.nextInt();
            a++;

        }

        System.out.println("here is the created array");

             //printing the array

        for (int  i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();// next line

        // finding the sun of the  input array

        System.out.println("sum of the input array  is ");

        int sum  = 0;

        for (int i = 0; i< arr.length; i++){

         sum = sum+ arr[i];

        }

        System.out.println(sum);
    }
}





