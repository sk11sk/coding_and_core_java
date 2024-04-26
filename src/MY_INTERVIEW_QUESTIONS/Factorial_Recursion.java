package MY_INTERVIEW_QUESTIONS;

import java.util.Scanner;

public class Factorial_Recursion {
    public static void main(String[] args) {Scanner  scan  = new Scanner(System.in);
        System.out.println("enter no for factorial ");
      int n = scan.nextInt();

        int factorial = 1;

        for (int i  = n; i>=1;i--){

            factorial  =  factorial*i;

        }

        System.out.println(factorial);
    }

}
