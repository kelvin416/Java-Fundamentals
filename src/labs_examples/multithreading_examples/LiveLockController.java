package labs_examples.multithreading_examples;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LiveLockController {
    private static Lock lock1 = new ReentrantLock(true);
    private static Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        new Thread(new Aone(lock1, lock2), "A").start();
        new Thread(new Btwo(lock1, lock2), "B").start();
    }
}

class Aone implements Runnable{
    //Keeping references on resource
    private final Lock lock1;
    private final Lock lock2;

    public Aone(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        System.out.println("Instance of class A run()");
        
        while (true){
            try {
                System.out.println("Instance of class A acquiring lock1");
                //IT is the first part that demonstrates the behaviour of Live lock
                lock1.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("Instance of class A acquired lock1");

                System.out.println("Instance of class A doing some work.");
                Thread.sleep(50);
            } catch (InterruptedException exc){
                exc.printStackTrace();
            }
            
            if (lock2.tryLock()){
                System.out.println("Intance of class A acquired lock2");
            } else {
                System.out.println("Instance of class A cannot acquire lock2, releasing lock1.");
                lock1.unlock();
                
                continue;
            }
            
            //never happens
            System.out.println("Instance of Class A doing some work, with lock1 and lock2");
            //breaks the loop
            break;
            
        }

        //Never Happens
        //Unlock both locks
        lock2.unlock();
        lock1.unlock();
    }
}

class Btwo implements Runnable{
    //Keeping references on resource
    private final Lock lock1;
    private final Lock lock2;

    public Btwo(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        System.out.println("Instance of class B run()");

        while (true){
            try {
                System.out.println("Instance of class B acquiring lock1");
                //IT is the first part that demonstrates the behaviour of Live lock
                lock1.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("Instance of class B acquired lock1");

                System.out.println("Instance of class B doing some work.");
                Thread.sleep(50);
            } catch (InterruptedException exc){
                exc.printStackTrace();
            }

            if (lock2.tryLock()){
                System.out.println("Intance of class B acquired lock2");
            } else {
                System.out.println("Instance of class B cannot acquire lock2, releasing lock1.");
                lock1.unlock();

                continue;
            }

            //never happens
            System.out.println("Instance of Class B doing some work, with lock1 and lock2");
            //breaks the loop
            break;

        }

        //Never Happens
        //Unlock both locks
        lock1.unlock();
        lock2.unlock();
    }
}
