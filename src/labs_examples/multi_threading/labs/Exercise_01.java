package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Exercise1Controller{
    public static void main(String[] args) {
        System.out.println("*** Main Thread Starting ***");

        //Starting a thread using object
        Exercise1Interface thread1 = new Exercise1Interface("Thread one");
        //Ex3 Setting Priorities
        thread1.thread.setPriority(Thread.NORM_PRIORITY);
        // starting a thread using Thread Class
        Thread thread2 = new Thread(new Exercise1Interface("Thread two"));
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.thread.start();
        thread2.start();

        try {
            thread1.thread.join();
            thread2.join();
        } catch (InterruptedException exc){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("*** Main Thread Ending ***");
    }
}
class Exercise1Interface implements Runnable{
    Thread thread;

    public Exercise1Interface(String name){
        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting...");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("In -> " + thread.getName() + ", count is: " + i);
            }
        } catch (InterruptedException exc){
            System.out.println(thread.getName() + " interrupted.");
        }

        System.out.println(thread.getName() + " terminating.");
    }
}
