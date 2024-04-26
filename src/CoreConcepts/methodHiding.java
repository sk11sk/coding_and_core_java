package CoreConcepts;

public class methodHiding {
}


// method hiding

class Parent {
    public static    void test(){ // method should be  static

        System.out.println(100);
    }

    public static void main(String[] args) {

    }

}

class Child  extends Parent{

    public static   void test(){   // method should be  static

        System.out.println(200);
    }

    public static void main(String[] args) {






        Parent a1  = new Parent ();
        a1.test();

        Parent a2 = new Child();  // so  the object  of child  is created but  the  parent  class method is getting  called .
        a2.test();


    }
}



//method overloading

// same code if we remove static keyword then it is  method overloading  now  the object
// of whatever class is created the method of same class is created


//class Parent {
//    public   void test(){
//
//        System.out.println(100);
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//}
//
//class Child  extends Parent{
//
//    public   void test(){
//
//        System.out.println(200);
//    }
//
//    public static void main(String[] args) {
//
//
//

//
//        Parent a1  = new Parent ();
//        a1.test();
//
//        Parent a2 = new Child();
//        a2.test();
//
//
//    }
//}



