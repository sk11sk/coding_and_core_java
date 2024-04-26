package CodingQuestions;


class palindrome_alternate2_integer_String {

    public static void main(String[] args) {


        int num  = 123;
        String s = String.valueOf(num);
        System.out.println(s);
      //  String s ="aa";
        String r = "";
        for (int  i  =s.length()-1;i>=0;i--){

            r =r+s.charAt(i);

        }

        int number = Integer.parseInt(r);
        System.out.println(number);



       if (s.equals(r)){

           System.out.println("num  is palindrome ");

       }else {

           System.out.println("num is not  palindrome ");
       }





       //jugaad =: int => String => int


//        HashMap<String , String > map  = new HashMap<>();
//
//        map.put(s,r);
//        map.put(r,s);
//
//        if (map.get(s)==map.get(r)){
//
//            System.out.println("strig is palindrome ");
//        }
//
//        else {
//
//            System.out.println("strig is not  palindrome ");
//        }

//       Map<String , String > map=  new HashMap<>();
//       map.put(s,s);
//       map.put(r,r);
//
//        if (map.get(s).equals(map.get(r))){
//            System.out.println("strig is palindrome ");
//       }else{
//
//            System.out.println("strig is not  palindrome ");
//        }
    }
}