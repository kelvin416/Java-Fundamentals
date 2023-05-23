package labs_examples.multithreading_examples;

class MultiThreadImplements {
    public static void main(String[] args) {
        System.out.println("*** Starting Thread ***");
        new Thread(new MyFirstRunnable(), "Option 3").start();
        System.out.println("*** Ending Thread ***");
    }
}

class MyFirstRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try{
            for (int count = 0; count < 10; count++){
                //Put this thread to sleep for 400 milliseconds.
                Thread.sleep(400);
                System.out.println("In " + Thread.currentThread().getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + "Interrupted");
        }
        System.out.println(Thread.currentThread().getName() + "terminating");
    }
}
