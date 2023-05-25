package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise2Controller{
    public static void main(String[] args) {
        // I will create a Thread using the thread class
        System.out.println("*** Main Thread Starting ***");
        Exercise2Interface runnable1 = new Exercise2Interface();
        Thread thread1 = new Thread(runnable1, "Thread 1");
        Exercise2Interface runnable2 = new Exercise2Interface();
        Thread thread2 = new Thread(runnable2, "Thread 2");

        //Then starting the thread since I don't have one.
        thread1.start();
        thread2.start();

        System.out.println("*** Main Thread Ending ***");
    }
}
class Exercise2Interface implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting....");
        try {
            for (int count = 0; count < 10; count++){
                Thread.sleep(500);
                System.out.println("Inside ->> " + Thread.currentThread().getName() + " the count is: " + count);
            }
        } catch (InterruptedException exc){
            exc.getMessage();
        }
        System.out.println(Thread.currentThread().getName() + " is terminating.");
    }
}
