package MY_INTERVIEW_QUESTIONS;

// using for loop
public class First_non_repeating_Character_of_string2 {


    public static void main(String[] args) {


        String str = "ababg";


        char[] c = str.toCharArray();

        int count =0;

        int x = c.length;

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < c.length; j++) {


                if (i != j) {

                    if (c[i] == c[j]) {
                        count++;
                        break;

                    } else if (j == c.length - 2 && c[i] != c[c.length - 2]) {

                        System.out.println(c[i]);

                        x = i;


                    }


                }


            }


        }

    }
}
================================================

    public class A {


public static void main (String [] args ){

String str  = "ssabkgkga";
char [] arr =str.toCharArray();
int n =arr.length;



for (int  i =0 ; i<n; i++){
    
      int count=0;
   for ( int j =0 ; j<n ; j++){
if (i!=j){
    
    if (arr[i]==arr[j]){
         
        count++;

}else if (arr[i]!=arr[j]&&j==n-1&&count==0){

System.out.println(arr[i]);
n=0; 


}
    

}  
    }

}

}


}
