package ThreadsExamples;

public class DEAD_LOCK {

     private static final  Object lock1 = new Object ();
     private static final  Object lock2 = new Object ();

    public static void main(String[] args) {

        Thread obj1  =  new Thread () {

            @Override
            public void run() {
                synchronized (lock1) {

                    System.out.println("Thread1  is on lock 1 ");

                    System.out.println("Thread1  is waiting  for lock 2   ");

                    synchronized (lock2){

                        System.out.println("Thread1  is on lock 1 and  lock 2 ");
                    }
                }
            }


        };


        Runnable obj2  =  () ->{

                              synchronized (lock2) {

                System.out.println("Thread2  is on lock 2 ");

                System.out.println("Thread2   is waiting for lock 1   ");

                               synchronized (lock1){

                    System.out.println("Thread2  is on lock 1 and lock 2  ");
                }
            }



        } ;

        obj1.start();

        Thread thread2  = new Thread(obj2);
        thread2.start();
    }
}




//  avoid dead  lock : small modification



//
//public class DEAD_LOCK {
//
//    private static final  Object lock1 = new Object ();
//    private static final  Object lock2 = new Object ();
//
//    public static void main(String[] args) {
//
//        Thread obj1  =  new Thread () {
//
//            @Override
//            public void run() {
//                synchronized (lock1) {
//
//                    System.out.println("Thread1  is on lock 1 ");
//
//                    System.out.println("Thread1  is waiting  for lock 2   ");
//
//                    synchronized (lock2){
//
//                        System.out.println("Thread1  is on lock 1 and  lock 2 ");
//                    }
//                }
//            }
//
//
//        };
//
//
//        Runnable obj2  =  () ->{
//
//            synchronized (lock2) {
//
//                System.out.println("Thread2  is on lock 2 ");
//
//                System.out.println("Thread2   is waiting for lock 1   ");
//
//                synchronized (lock1){
//
//                    System.out.println("Thread2  is on lock 1 and lock 2  ");
//                }
//            }
//
//
//
//        } ;
//
//        obj1.start();
//
//        Thread thread2  = new Thread(obj2);
//        thread2.start();
//    }
//}
