package labs_examples.multithreading_examples;

class SynchronizedController {
    public static void main(String[] args) {
        SynchronizedSender sender = new SynchronizedSender();
        SynchronizedThread thread1 = new SynchronizedThread(" Hi ", sender);
        SynchronizedThread thread2 = new SynchronizedThread(" Bye ", sender);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception exc){
            System.out.println("Interrupted");
        }
    }
}

class SynchronizedThread extends Thread{
    private String msg;
    private Thread thread;
    SynchronizedSender sender;

    public SynchronizedThread(String message, SynchronizedSender obj){
        msg = message;
        sender = obj;
    }

    public void run(){
        sender.send(msg);
    }
}

class SynchronizedSender{
    public synchronized void send(String msg){
        System.out.print("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception exc){
            System.out.println("Thread Interrupted");
        }
        System.out.println("\n" + msg + " Sent");
    }
}
