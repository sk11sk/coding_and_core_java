package MY_INTERVIEW_QUESTIONS;

import java.util.HashMap;
import java.util.Map;

public class String_eligible_for_palindrome {


    public static void main(String[] args) {


        String str  =  "eey";

        char[] c = str.toCharArray();

        Map<Character,Integer> charFreq =  new HashMap<>();

        for (char ch : c){

            if (!charFreq.containsKey(ch)){

                charFreq.put(ch,1);
            }else {

                charFreq.put(ch,charFreq.get(ch)+1);

            }

        }

        int oddCount=0;


        for ( char k :charFreq.keySet()){



            if (charFreq.get(k) % 2!=0){

                oddCount++;
            }

        }
        if (oddCount >1){

            System.out.println( " String is not  palindrome ");
        }else {

            System.out.println( " String is eligible for palindrome ");
        }

    }
}
