package Arrays;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter the  size of array ");
        int n  = scanner.nextInt();

        Scanner s =  new Scanner(System.in);

        System.out.println(" enter the elements ");

          int i  = 0;


        int [] x = new int[n];

        // using for each
        for (int l : x){

            x[i] = s.nextInt();
            i++;

        }


// using  for loop

//        for(int i  = 0;i<n;i++){
//
//            x[i] = s.nextInt();
//        }


        for (int k : x){

            System.out.println(k);
        }
    }
}




