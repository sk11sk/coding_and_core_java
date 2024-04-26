package Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
//         int  j  =0;
//         int n = (arr.length-1)/2;
//
//         if(arr.length%2==0){
//             n= n+1;
//
//         }
//        for (int i =arr.length-1;i>=n;i--){
//
//            int temp = arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//                j++;
//
//
//        }
        
        int sp = 0; ;
        int ep = arr.length-1;

        while (sp<ep){
            int temp  = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] =  temp;
            sp ++;
            ep --;
        }



        for(int k :arr){

            System.out.println(k);
        }
    }
}
