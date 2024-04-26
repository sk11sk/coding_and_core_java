package Class_Object;


class A {
    int x = 30;

    public static void main(String[] args) {


        A a1 = new A();
        A a2 = new A();

        // 2 objects will be created  in the heap memory and both  objects memory address will be assigned to a1 and a2
        // and both will have x=30 inside them so so when ever the changes are made that
                //  is made on to their own copy of variables respectively.



        a1.x = 20; //changing  the value of x but the values will be changed only for the  object a1  not a2 .
        System.out.println(a1.x);
        System.out.println(a2.x);


        // each object has its own copy of  non static variables so when ever the changes are made that
        //is made on to their own copy of variables respectively.


    }

}



class B {
    int x =10;

  public   void show (){


    }

   public   void test () {
         System.out.println(x);// non static variable can be called directly inside the non static method

         show();  // non static method  can be called directly inside the non static method

     }
//  public  static  void test1 (){
//        int y=20;//   local variable is stored  in stack not heap
//         B b1  = new B ();
//
//        System.out.println(b1.x); // non static variable/ method  can not be called directly inside the  static method
//          b1.show();                      // we will have to make the object for that . for
//
//
//    }




        }



class Student {
    //static and non static variable
    public String name;
    public int age;

    public static String college = "RGPV";

    public void show() {

        System.out.println(name + " : " + age + " " + college);

    }

    public static void main(String[] args) {


        Student student = new Student();
        student.name = "shuarabh";
        student.age = 28;
        Student.college = " RGTU ";


        Student student1 = new Student();
        student1.name = "shubham";
        student1.age = 27;
        Student.college = " BIST ";   // static variable is shared among all the objects that is why when you change the
        // value of static variable it reflects  everywhere.


        student.show();
        student1.show();

// static variable is shared among all the objects , make a field static which is same for every field in  this case it is college
// so that we dont have to initialise it in each objects

//        System.out.println(student.name + "  " + student.age+" "+college );
//        System.out.println(student1.name + "  " + student1.age+" "+college );




    }
}

    class D {

        {

            System.out.println("IIB");
        }

        static {

            System.out.println("SIB");

        }

        D(){

            System.out.println("constrcutor ");
        }

        public static void main(String[] args) {

            D d1 = new D ();
        }


}


class Employee {

    String name;
    int age;


    public void show (){

        System.out.println(name+ "  " +age);

    }

    public static void show1 (Employee e){    // non static members can not be called directly inside static method
                                             // you need to pass object  in order to call the non static variables

        System.out.println(e.name+ "  " +e.age);

    }



    public static void main(String[] args) {


        Employee e1  = new Employee();
        e1.name="shaurabh";
        e1.age = 26;

        Employee e2 = new Employee();
        e2.name="shubham";
        e2.age=28;


//        e1.show();
//        e2.show();

        Employee.show1(e1);
        Employee.show1(e2);



    }



}