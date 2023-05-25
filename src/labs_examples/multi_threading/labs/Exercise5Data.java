package labs_examples.multi_threading.labs;

public class Exercise5Data {
    String fruits;
    boolean dataTransfer = true;

    public synchronized void send2(String fruits){
        //False if sender should wait
        while (!dataTransfer){
            try {
                wait();
            } catch (InterruptedException exc){
                Thread.currentThread().interrupt();
                System.out.println("Thread has been interrupted" + exc);
            }
        }
        dataTransfer = false;
        this.fruits = fruits;
        notifyAll();
    }

    public synchronized String receive(){
        while (dataTransfer){
            try {
                wait();
            }catch (InterruptedException exc){
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted" + exc);
            }
        }
        dataTransfer = true;

        notifyAll();
        return fruits;
    }
}
