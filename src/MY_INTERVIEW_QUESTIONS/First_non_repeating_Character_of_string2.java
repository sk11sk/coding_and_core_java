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
