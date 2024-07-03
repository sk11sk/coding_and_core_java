package ThreadsExamples;


// sequential  object execution

//
//public class A   {
//
//    public void show () {
//
//        for (int i = 0; i<10;i++)
//        {
//
//            System.out.println("hi");
//
//        }
//
//    }
//}
//
//
//class Take_Input_array_print_find_sum  {
//
//    public void show () {
//
//        for (int i = 0; i<10;i++) {
//
//            System.out.println("hello");
//
//        }
//
//    }
//
//}
//
//
//class C {
//
//    public static void main(String[] args) {
//     A obj1  = new A ();
//     Take_Input_array_print_find_sum obj2  = new Take_Input_array_print_find_sum ();
//
//        obj1.show();   // sequential  object execution
//        obj2.show();    // sequential  object execution
//
//    }
//
//}
//


// multithreading --
//
//public class A extends Thread   {
//
//    public void run () {
//
//        for (int i = 0; i<5;i++)
//        {
//
//            System.out.println("hi");
//
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//
//    }
//}
//
//
//class Take_Input_array_print_find_sum extends Thread  {
//
//    public void run () {
//
//        for (int i = 0; i<5;i++) {
//
//            System.out.println("hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//
//}
//
//
//class C {
//
//    public static void main(String[] args) {
//        A obj1  = new A ();
//        Take_Input_array_print_find_sum obj2  = new Take_Input_array_print_find_sum ();
//
//
//        obj1.start();   // sequential  object execution
//
//        obj2.start();    // sequential  object execution
//
//    }
//
//}


//  using runnable interface

//public class A implements Runnable  {
//
//    public void run () {
//
//        for (int i = 0; i<5;i++)
//        {
//
//            System.out.println("hi");
//
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//
//    }
//}
//
//
//class Take_Input_array_print_find_sum implements Runnable {
//
//    public void run () {
//
//        for (int i = 0; i<5;i++) {
//
//            System.out.println("hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//
//}
//
//
//class C {
//
//    public static void main(String[] args) {
//
//
////        A obj1  = new A ();
////        Take_Input_array_print_find_sum obj2  = new Take_Input_array_print_find_sum ();
//
//
//        Runnable obj1  = new A ();
//        Runnable obj2  = new Take_Input_array_print_find_sum ();
//
//
//
//
//        Thread thread1 = new Thread(obj1);
//        Thread thread2 = new Thread(obj2);
//
//
//
//        thread1.start();
//
//        thread2.start();
//
//    }
//
//}


// implement  anonymous class
// trying to  create  threads using anonymous class and   lambda expression


//
//class C {
//
//    public static void main(String[] args) {
//
//
//
//// trying to  create  class A inside main method using anonymous class
//
//        Runnable obj1  = new Runnable () {
//            @Override
//            public void run() {
//                for (int i = 0; i<5;i++) {
//
//                    System.out.println("hi");
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//
//// trying to  create  class  Take_Input_array_print_find_sum inside main method using Lambda Expression
//
//
//
//        Runnable obj2  = () -> {
//
//            for (int i = 0; i<5;i++) {
//
//                System.out.println("hello");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//
//
//
//
//
//        Thread thread1 = new Thread(obj1);
//        Thread thread2 = new Thread(obj2);
//
//
//        thread1.start();
//
//        thread2.start();
//
//    }
//
//}


// RACE CONDITION :: two threads operating on the  same data : data corruption not thread safe

//class Counter{
//
//    int count ;
//
//    public void  increment (){
//
//        count++;
//    }
//
//}
//
//class C {
//
//    public static void main(String[] args) throws InterruptedException {
//
//      Counter counter  = new Counter ();
//
//        Runnable obj1  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//
//// trying to  create  class  Take_Input_array_print_find_sum inside main method using Lambda Expression
//
//
//        Runnable obj2  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//        Thread thread1 = new Thread(obj1);
//        Thread thread2 = new Thread(obj2);
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println(counter.count);  // not thread safe ..... data corruption
//    }
//
//}
//

// using synchronized  keyword  in  method

//
//class Counter{
//
//    int count ;
//
//    public  synchronized void  increment (){
//
//        count++;
//    }
//
//}
//
//
//class C {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Counter counter  = new Counter ();
//
//        Runnable obj1  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//        Runnable obj2  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//        Thread thread1 = new Thread(obj1);
//        Thread thread2 = new Thread(obj2);
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println(counter.count);
//    }
//
//}

 // USING SYNCHRONIZED BLOCK


//    class Counter{
//
//        int count ;
//
//    public  void  increment (){
//
//        synchronized (this)
//
//    { count++;}
//
//    }
//
//}
//
//
//class C {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Counter counter  = new Counter ();
//
//        Runnable obj1  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//        Runnable obj2  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//        Thread thread1 = new Thread(obj1);
//        Thread thread2 = new Thread(obj2);
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println(counter.count);
//    }
//
//}
//
//




// using  class level lock  keyword

//
//class Counter{
//
//   int count ;
//
//        public  void  increment (){
//
//
//            synchronized (Counter.class){
//
//
//            { count++;}
//
//        }
//
//    }
//
//
//}
//
//
//class C {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Counter counter  = new Counter ();
//
//        Runnable obj1  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//        Runnable obj2  = () -> {
//
//            for (int i = 0; i<10000;i++) {
//
//                counter.increment();
//            }
//
//        };
//
//        Thread thread1 = new Thread(obj1);
//        Thread thread2 = new Thread(obj2);
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println(counter.count);
//    }
//
//}

// using this keyword


class Counter{

    int count ;

    public  void  increment (){


        synchronized (this){


            { count++;}

        }

    }


}


class C {

    public static void main(String[] args) throws InterruptedException {

        Counter counter  = new Counter ();

        Runnable obj1  = () -> {

            for (int i = 0; i<10000;i++) {

                counter.increment();
            }

        };

        Runnable obj2  = () -> {

            for (int i = 0; i<10000;i++) {

                counter.increment();
            }

        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.count);
    }

}




