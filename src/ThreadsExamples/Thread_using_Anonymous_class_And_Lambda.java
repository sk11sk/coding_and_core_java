package ThreadsExamples;

public class Thread_using_Anonymous_class_And_Lambda {

    public static void main(String[] args) {


      //  using annonymous  class

       Runnable rn  =  new Runnable() {
           @Override
           public void run() {
               for (int i  = 0; i< 10; i++) {

                   System.out.println(i);
                   try {
                       Thread.sleep(100);

                   } catch (InterruptedException e) {

                   }

               }
           }
       } ;



        //  using lambda expression

//        Runnable rn  = () -> {
//
//            for (int i  = 0; i< 10; i++) {
//
//                System.out.println(i);
//
//                try {
//                    Thread.sleep(100);
//
//                } catch (InterruptedException e) {
//
//
//                }
//
//            }
//        };


        //start  the run nethod

                Thread  thread  = new Thread (rn);
                thread.start();


    }
}
