public class Lambda_Anonymous {
}




 interface A {           // only one abstract method  you can denote   it with @FUNCTIONAL INTERFACE
    public void test ();

}

class B   { // no inheritance needed to  implement feature of lambda expression or anonymous class


    public static void main(String[] args) {

        // anonymous class

        A a1 = new A ()
        {
            public void test(){
                System.out.println("call test method using  anonymous class ");
            }

        };
        a1.test();




        // lambda expression

        A a2  = ()->                 // implementation of test() method only
        {
            System.out.println("call test method  using lambda expression ");

        };

        a2.test();

    }


}







interface C {
    public void test ();
    public void test1 ();

}

class D   { // no inheritance needed to  implement feature of lambda expression or anonymous class
    public static void main(String[] args) {
        // anonymous class

        C c1 = new C ()
        {
            public void test(){
                System.out.println("test");
            }

            public void test1(){
                System.out.println("test 1");
            }

        };
        c1.test();
        c1.test1();





// here we  cant  use lambda expression cause this interface  C has more than one  abstract method
    }



}


