package CodingQuestions;

import java.util.Scanner;

public class Palindrome_alternate {
    public static void main(String[] args) {

//       Scanner scan  = new Scanner(System.in);
//        System.out.println("enter a word ");
//        String str = scan.next();

        String str  = "maddam";


        int n = str.length()/2;

        int j = str.length()-1;

        for(int  i  =0;i<=n ; i++) {
            
            if (str.charAt(i) != str.charAt(j)) {

                System.out.println("string is not palindrome");
                break;

            } else {

                if (str.charAt(i) == str.charAt(j) & n == i) {
                    System.out.println("string is  palindrome");

                }
            }
            j--;


        }
    }
}

