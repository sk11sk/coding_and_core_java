package CoreConcepts;


import java.util.*;
public class MyClass {




    public static boolean isPalindrome(String word ){

        word = word.toLowerCase();

        Map<Character ,Integer> charFrequency = new HashMap<>();

        for (char ch: word.toCharArray()){

            if (Character.isLetter(ch)){

                charFrequency.put(ch,charFrequency.getOrDefault(ch,0)+1);
            }


        }
        System.out.println(charFrequency.values());

        int oddCount = 0;
        for (int count:charFrequency.values()){

            if (count%2==1){
                oddCount++;
                if (oddCount>1){
                    return false;

                }

            }
        }
        return true ;

    }


    public static void main(String args[]) {

        String word  = "rotro";

        if(isPalindrome(word)){
            System.out.println(word + " : is palindrome ");
        }else{
            System.out.println(word + ": is not  palindrome ");

        }
    }
}

class M {

    public static void main(String[] args) {

        String s = "Shaurabh";
        String lowerCase = s.toUpperCase();
        System.out.println(lowerCase);
        System.out.println("===========");
        char[] charArray = s.toCharArray();
        for( char c: charArray){
            System.out.println(c);

        }
        System.out.println("===========");
       Character [] char1 = {'a','b','c','3'};
      for (Character c : char1){

          System.out.println(Character.isLetter(c));
      }
        System.out.println("===========");
        Map<Character ,Integer> charFrequency = new HashMap<>();
       charFrequency.put('c',charFrequency.getOrDefault('c',0)+1);
       charFrequency.put('a',charFrequency.getOrDefault('a',2)+5);
        System.out.println(charFrequency);

        System.out.println("===========");

        String word = "abcdefgha";
        Map<Character ,Integer> charFrequency1 = new HashMap<>();

        for (char ch: word.toCharArray()){

            if (Character.isLetter(ch)){

                charFrequency1.put(ch,charFrequency1.getOrDefault(ch,0)+1);
            }


        }
        System.out.println(charFrequency1);

        System.out.println("===========");

        System.out.println(charFrequency1.values());

    }


}