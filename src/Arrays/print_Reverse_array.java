package Arrays;

import java.util.Scanner;

public class print_Reverse_array {
    public static void main(String[] args) {


        Scanner  scan  = new Scanner(System.in);
        int n = scan.nextInt(); // length of an array


        Scanner  elements   = new Scanner(System.in);
        int arr [] = new int[n]; // define a new array  with provided array length


        for (int i = 0;i<n;i++){ // take the elements as input

            arr [i]= elements.nextInt();
        }


        for (int i = arr.length-1;i>=0;i--){

             System.out.print(arr[i] + " ");
         }

       // copying in second array then printing

        int arr2 []  = new int [arr.length];
        int j = 0;
        for (int i = arr2.length-1;i>=0;i--) { // take the elements as input


            arr2 [j]= arr[i];
            j++;
        }

        for (int i = 0;i<arr2.length;i++){

            System.out.print(arr2[i] + " ");
        }

    }
}
