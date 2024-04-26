package Arrays;

public class duplicates {
//sort and remove
    public static void main(String[] args) {

        int [] arr = {10, 30, 20, 20, 10, 40, 30, 80, 40};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j])  {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        for (int i : arr) {
            System.out.println(i);

        }
        System.out.println("==============");

        int [] y = new int [arr.length];
        int j=0;
        for ( int i  = 0; i<arr.length-1 ; i++){

            if (arr[i]!= arr[i+1]){

                y[j]=arr[i];
                j++;
            }
        }
        y[j] =arr[arr.length-1];
        for (int i : y) {

             if (i!=0){

                 System.out.println(i);

             }

        }

    }
}
