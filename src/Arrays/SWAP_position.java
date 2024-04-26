package Arrays;




public class SWAP_position {
    public static void main(String[] args) {

        int []  arr  = {10,20,30,40,50};

        //swap 1 n 3


            int  temp  = arr[1];
            arr[1] = arr[3];
            arr[3] = temp;

            for (int  i :arr){

                System.out.println(i);
            }




    }
}
