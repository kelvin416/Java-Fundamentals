package labs_examples.multi_threading.labs;
//Synchronized Block
public class Exercise4Block {
    // Driver class
    public static void main(String[] args) {
        Sender send = new Sender();
        Thread send1 = new Thread(new SendThread("Catch a chicken. ", send));
        Thread send2 = new Thread(new SendThread("Chicken caught. ", send));

        send1.start();
        send2.start();

        try {
            send1.join();
            send2.join();
        } catch (Exception exc){
            System.out.println("Thread Interrupted");
        }
    }
}
class Sender{
    //this is a sender class for messages
    public void send(String message){
        System.out.println("Sending: " + message);
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc){
            System.out.println("Thread Interrupted");
        }
        System.out.println(message + " has been sent.");
    }
}
class SendThread extends Thread{
    //threaded sender class
    String message;
    Sender sender;

    public SendThread(String message, Sender sender) {
        this.message = message;
        this.sender = sender;

        // Only one thread can send a message at a single time
        synchronized (sender){
            sender.send(message);
        }
    }
}

