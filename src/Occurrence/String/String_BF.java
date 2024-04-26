package Occurrence.String;

public class String_BF {


    public static void main(String[] args) {



//            String  s = "my name is name is shaurabh";
//            String[] arr = s.split(" ");

        // String arr []  = {"my","name" ,"is", "name" , "is" ,"shaurabh"};

        String s []  ={"my name is name is shaurabh"};

        String s1 = s[0];
        String[] arr = s1.split(" ");

        for (int i  = 0;  i< arr.length;i++){
            int count  =1;
            for (int j  = i+1;  j< arr.length;j++){

                if ( arr[i].equals(arr[j])  ){

                    count++;
                    arr[j]="0";

                }


            }
            if (!arr[i].equals("0") && count>1){

                System.out.println(arr[i] +" : occurs :" + count);

            }

        }

    }


}
