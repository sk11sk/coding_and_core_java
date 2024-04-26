package MY_INTERVIEW_QUESTIONS;

public class reverse_integer_recursion {

    public static void main(String[] args) {
        reverse(456);

    }


    public static  void reverse(int num){

        if (num<10){
            System.out.print(num);

        }else{

          int  x= num%10;
           System.out.print(x);
           reverse(num/10);

        }
    }
}
