package CodingQuestions;


import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_Int_Set {
    public static void  main (String [] args ){
        int [] arr = {10,10,40,40,30,20,50};

        Set<Integer> set = new HashSet<>();

        for (int num :arr){

            set.add(num);
        }

        System.out.println(set);

    }



}