package Arrays;

public class B {

    public static void main(String[] args) {
        int [] arr = {10,20,30,40};

        int sp  = 0;
        int ep = arr.length-1;
        while (sp<ep)
        {
           int temp = arr[ep];
            arr[ep] = arr[sp];
            arr[sp] = temp;

            sp++;
            ep--;
        }
        for (int i : arr){
            System.out.println(i);

        }
    }
}
