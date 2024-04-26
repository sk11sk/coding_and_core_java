package Occurrence.String;

import java.util.HashMap;
import java.util.Map;

public class String_HM {


    public static void  main (String [] args ){



        //String [] arr  =  {"shaurabh", "is", "my", "name", "is", "name", "shaurabh"};

//            String [] s  = {"shaurabh is my name is name shaurabh"};  // spacing between  words not more than one space
//               String s1 = s[0];
//              String [] arr = s1.split(" ");

        String s   = "shaurabh is my name is name shaurabh"; // spacing between  words not more than one space
        String [] arr = s.split(" ");


        Map<String  ,Integer> map = new HashMap<>();

        for (String str :arr){

            if (!map.containsKey(str)){

                map.put(str,1);

            }else{

                map.put(str,map.get(str)+1);

            }


        }


        System.out.println(map);

        System.out.println("=============");

        for (String k :map.keySet()){

            if (map.get(k)==1){

                System.out.println(k +" "+ map.get(k));

            }




        }

    }



}
