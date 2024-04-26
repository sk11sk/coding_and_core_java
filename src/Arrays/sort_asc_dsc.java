package Arrays;

public class sort_asc_dsc {
    public static void main(String[] args) {

        int[] arr = {10, 30, 20, 20, 10, 40, 30, 80, 40};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        for (int i : arr) {
            System.out.println(i);

        }

        System.out.println("========================");

//Descending


        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        for (int i : arr) {
            System.out.println(i);


        }
    }
}
