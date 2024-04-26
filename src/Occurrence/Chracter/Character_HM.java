package Occurrence.Chracter;

import java.util.HashMap;

public class Character_HM {

        public  static void main  (String [] args){

            String s  = "aaabbbcccaabbbb" ;

            char[] C = s.toCharArray();

            HashMap<Character, Integer > hp  = new HashMap <>();


            for (Character c :C ){

                if (!hp.containsKey(c)){

                    hp.put(c,1);
                }  else {


                    hp.put(c, hp.get(c)+1);

                }

            }

            for (Character k : hp.keySet()){


                System.out.println(k+"  "+hp.get(k));

            }

        }


    }


