package Occurrence.Chracter;




//occurrence  of character brute force final
public class Character_BF {

    public static void main(String[] args) {

        String str = "sssaab";

        char[] arr = str.toCharArray();


        for (int  i =0; i< str.length(); i++){

            int count =1;

            for (int j =i+1; j<str.length();j++){

                if (arr[i]==arr[j]){
                    count++;
                    arr[j]=0;

                }


            }

            if (arr[i]!=0 ){
                System.out.println(arr[i]+"  "+ count);

            }


        }


    }
}
