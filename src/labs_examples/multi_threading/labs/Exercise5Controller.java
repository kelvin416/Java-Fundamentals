package labs_examples.multi_threading.labs;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise5Controller {
    public static void main(String[] args) {
        Exercise5Data data = new Exercise5Data();
        Thread sender1 = new Thread(new FruitSender(data));
        Thread sender2 = new Thread(new FruitReceiver(data));

        sender1.start();
        sender2.start();

    }
}

class FruitSender implements Runnable{
    public Exercise5Data exercise5Data;

    public FruitSender(Exercise5Data exercise5Data){
        this.exercise5Data = exercise5Data;
    }

    @Override
    public void run() {
        String[] fruits = {"Apples", "Oranges", "Grapes", "Avocados", "Pineapples", "Final"};

        for (String fruit : fruits) {
            exercise5Data.send2(fruit);
            //A sleep Thread when processing is heavy
            try {
                Thread.sleep(500);
            } catch (InterruptedException exc){
                Thread.currentThread().interrupt();
                System.out.println("Sender Interrupted" + exc);
            }
        }
    }
}

class FruitReceiver implements Runnable{
    public Exercise5Data load;

    public FruitReceiver(Exercise5Data load) {
        this.load = load;
    }

    @Override
    public void run() {
        for (String messageReceived = load.receive();
             !"Final".equals(messageReceived);
             messageReceived = load.receive()){
            System.out.println(messageReceived);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException exc){
                exc.getMessage();
            }
        }
    }
}


