package CoreConcepts;


public class Main {
    public int test (int a, int b) {
        System.out.println(a);
        return 10;
    }
    public int test(int a, int b,int c) {
        System.out.println(a);
        return 10;
    }
    public int test(String  a, int b) {
        System.out.println(a);
        return 10;
    }
    public String test(int a, int  b, int c, int d ) {
        System.out.println(a);
        return "10";
    }


    public char test( char a) {
        System.out.println(a);
        return 'a';
    }

    public static void main(String [] args) {
        Main main = new Main ();
        main.test('b');
        main.test(10,20);

    }
}
