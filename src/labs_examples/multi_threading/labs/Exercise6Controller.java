package labs_examples.multi_threading.labs;

public class Exercise6Controller {
    public static void main(String[] args) {
        SetSequence thread1=new SetSequence(1);
        SetSequence thread2=new SetSequence(2);
        SetSequence thread3=new SetSequence(0);

        Thread player1=new Thread(thread1,"Player1");
        Thread player2=new Thread(thread2,"Player2");
        Thread player3=new Thread(thread3,"PLayer3");

        player1.start();
        player2.start();
        player3.start();
    }
}

class SetSequence implements Runnable{
    public int max_numbers = 100 ;
    static int number = 1;
    int remainder;
    static Object lock=new Object();

    SetSequence(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (number < max_numbers -1) {
            synchronized (lock) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " current number is: " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
