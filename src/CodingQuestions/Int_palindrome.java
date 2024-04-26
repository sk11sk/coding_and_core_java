package CodingQuestions;



class int_plndrm{

    public static void main(String[] args) {

        int num = 12321;
        int temp = num;
        int rev =0;
        int r=0;

        while(num>0)
        {
            r = num % 10;
            rev = (rev*10)+r;
            num = num/10;
        }


        if (temp==rev){
            System.out.println("number  is palindrome ");

        }else{
            System.out.println("number  is not palindrome ");
        }

    }
}












//
//
//
//
//public class Int_palindrome {
//    public static void main(String[] args) {
//
//
//
//        int num  = 12345321;
//        String s = String.valueOf(num);
//
//        boolean result  = palindrome(s);
//
//        if(result){
//
//        System.out.println("word is palindrome ");
//
//        }else{
//                System.out.println("word is not  palindrome ");
//        }
//
//
//
//                }
//
//public static boolean palindrome (String str ) {
//
//    int sp = 0;
//    int ep = str.length() - 1;
//
//    while (sp < ep) {
//
//        if (str.charAt(sp) != str.charAt(ep)) {
//
//            return false;
//        }
//
//        sp++;
//        ep--;
//
//    }
//
//    return true;
//
//}
//}

