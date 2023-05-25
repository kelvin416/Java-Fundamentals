package labs_examples.multi_threading.labs;
//Synchronized method
public class Exercise4Method {
    //Driver class
    public static void main(String[] args) {
        Sender2 sender2 = new Sender2();
        Thread thread1 = new Thread(new SendThread2("Plant some Apples", sender2));
        Thread thread2 = new Thread(new SendThread2("Apples have been planted", sender2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException exc){
            System.out.println("Thread has been interrupted.");
        }
    }
}

class Sender2{
    //this is a sender class for messages with a synchronized method
    public synchronized void send(String message){
        System.out.println("Sending: " + message);
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc){
            System.out.println("Thread Interrupted");
        }
        System.out.println(message + " has been sent.");
    }
}
class SendThread2 extends Thread{
    //threaded sender class
    String message;
    Sender2 sender2;

    public SendThread2(String message, Sender2 sender2) {
        this.message = message;
        this.sender2 = sender2;

        sender2.send(message);
        System.out.println(Thread.currentThread().getName()+ " terminating");
    }
}
