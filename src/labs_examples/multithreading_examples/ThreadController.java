package labs_examples.multithreading_examples;

class ThreadController {
    public static void main(String[] args) {
        ThreadPriorities priority1 = new ThreadPriorities("High priority");
        ThreadPriorities priority2 = new ThreadPriorities("Low priority");

        //setting the priorities
        priority1.thread.setPriority(Thread.NORM_PRIORITY-2);
        priority2.thread.setPriority(Thread.NORM_PRIORITY+2);

        //starting the threads
        priority1.thread.start();
        priority2.thread.start();

        try {
            priority1.thread.join();
            priority2.thread.join();
        } catch (InterruptedException exc){
            System.out.println("Main Thread interrupted");
        }

        System.out.println("\nHigh priority thread counted to " + priority1.count);
        System.out.println("\nLow priority thread counted to " + priority1.count);
    }
}
class ThreadPriorities implements Runnable{
    int count;
    Thread thread;
    static boolean stop = false;
    static String currentName;
    int id = 0;

    public ThreadPriorities(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting");
        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0){
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000);

        stop = true;
        System.out.println("\n" + thread.getName() + " terminating");
    }
}
