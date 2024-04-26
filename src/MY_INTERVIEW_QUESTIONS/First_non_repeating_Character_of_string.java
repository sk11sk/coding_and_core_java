package MY_INTERVIEW_QUESTIONS;

import java.util.LinkedHashMap;
import java.util.Map;


// using map

public class First_non_repeating_Character_of_string {

        public static void main(String[] args) {
            String str = "ghghghghjghf";


            char[] c = str.toCharArray();

            Map<Character, Integer> map = new LinkedHashMap<>();

            for (char ch : c) {

                map.put(ch, map.getOrDefault(ch, 0) + 1);
//            if (!map.containsKey(ch)){
//
//                map.put(ch,1);
//
//            }else{
//                map.put(ch,map.get(ch)+1);
//
//            }
//
            }



            for (char ch : map.keySet()) {

                if (map.get(ch) == 1) {
                    System.out.println(ch);
                    break;

                }

            }
        }
}


// using  for loop