package CodingQuestions;

import java.sql.SQLOutput;

public class Palindrome {

    public static void main(String[] args) {

        String s  = "aa";

        boolean result  = palindrome(s);

        if(result){

            System.out.println("word is palindrome ");

        }else{
            System.out.println("word is not  palindrome ");
        }



    }

        public static boolean palindrome (String str ) {

            int sp = 0;
            int ep = str.length() - 1;

            while (sp < ep) {

                if (str.charAt(sp) != str.charAt(ep)) {

                    return false;
                }

                sp++;
                ep--;

            }

            return true;

        }
}









//alternate way
//
// class Plndrm {
//
//    public static void main(String[] args) {
//
//        String str  = "aaaada";
//
//        int sp = 0;
//        int ep = str.length() - 1;
//        int n  = str.length()/2;
//
//        while (sp < ep) {
//
//            if (str.charAt(sp) != str.charAt(ep)) {
//
//                System.out.println("word is not  palindrome ");
//                break;
//
//            }else if (str.charAt(sp) == str.charAt(ep) && sp+1 == n) {
//
//
//                System.out.println("word is  palindrome ");
//                break;
//
//            }
//
//            sp++;
//            ep--;
//
//        }
//
//
//
//    }
//
//
//
//}
//
//
//






