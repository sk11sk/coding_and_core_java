package Occurrence.Integer;

public class Integer_BF {

    public static void main(String[] args) {
        int a[]={2,2,3,5,5,2,8,6,6,8};

        for (int i = 0; i < a.length; i++) {
            int c = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] & a[i] != 0) {
                    c++;
                    a[j] = 0;
                }
            }
            if(a[i]!=0 && c>1) {
                System.out.println(a[i] + " occurs : " + c);
            }
        }
    }
}
