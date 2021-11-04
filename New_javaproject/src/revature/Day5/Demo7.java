package revature.Day5;

/**
 * MultiThread
 * join threads with .join() method. .sleep() method must be called
 * with try-catch use t1.join(). (usually the threads process executes in a parrallel fasion.
 */
class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Name: "+ Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        ThreadJoinDemo t3 = new ThreadJoinDemo();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();



    }
}
