package ThreadsExamples;

public class MyThread2 extends Thread {


    @Override
    public void run() {
        for (int i  = 0; i< 10; i++) {

            System.out.println("run");
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {

            }

        }
    }

    public static void main(String[] args) {


        MyThread2 myThread2   = new MyThread2 ();
        myThread2.start();

    }
}



