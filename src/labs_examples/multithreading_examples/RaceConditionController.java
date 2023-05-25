package labs_examples.multithreading_examples;

import java.util.Random;

class RaceConditionController {
    public static void main(String[] args) throws InterruptedException {
        //The resource to be incremented
        Integer counter = 0;
        Incrementer incrementer = new Incrementer(counter);

        //Number of Parralel thread that will update the counter
        int parallelThreads = 10;

        //Placing an array to keep all the threads
        Thread[] threads = new Thread[parallelThreads];

        // create all thread
        for (int i = 0; i < parallelThreads; i++) {
            threads[i] = new Thread(incrementer);
        }

        for (Thread thread : threads) {
            try {
                Thread.sleep(100 + new Random().nextInt(100));
            } catch (InterruptedException exc){
                exc.printStackTrace();
            }
            thread.start();
        }

        //Ensure all threads finish
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Done. Final counter: " + counter);
    }
}

class Incrementer implements Runnable{
    Integer counter;

    public Incrementer(Integer counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        Integer counterValue = counter;

        try{
            Thread.sleep(100 + new Random().nextInt(100));
        } catch (InterruptedException exc){
            exc.printStackTrace();
        }

        //Increase counter
        counter = counterValue + 1;
        System.out.println(Thread.currentThread().getName() + " increments value: " + counterValue + " -> " + counter);
    }
}
