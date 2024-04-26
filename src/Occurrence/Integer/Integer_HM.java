package Occurrence.Integer;

import java.util.HashMap;

public class Integer_HM {


    //occurrence  of integer HashMap final


        public  static void main  (String [] args){
            int [] a  =  {2,4,5,3,1,1,3,6,6};

            HashMap<Integer, Integer > hp  = new HashMap <>();

            for (int num :a ){

                if (!hp.containsKey(num)){

                    hp.put(num,1);
                }  else {


                    hp.put(num, hp.get(num)+1);

                }

            }

            for (int k : hp.keySet()){

                if (hp.get(k) ==1 )
                {
                    System.out.println(k+"  "+hp.get(k));

                }
            }
        }



    }


