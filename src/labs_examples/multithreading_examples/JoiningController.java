package labs_examples.multithreading_examples;

class JoiningController {
    public static void main(String[] args) {
        JoiningThreads joining1 = new JoiningThreads();
        JoiningThreads joining2 = new JoiningThreads();
        JoiningThreads joining3 = new JoiningThreads();

        //Thread1 starts
        joining1.start();

        //Then start the second thread after the first thread has finished
        try{
            System.out.println("Curren Thread: " + Thread.currentThread().getName());
            joining1.join();
        } catch (Exception exc){
            System.out.println("Exception has been caught " + exc);
        }

        //Second thread starts
        joining2.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            joining2.join();
        } catch (Exception exc){
            System.out.println("Exception has been caught " + exc);
        }

        joining3.start();
    }
}
class JoiningThreads extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch (InterruptedException exc){
                System.out.println("Exception has been caught " + exc);
            }

            System.out.println(i);
        }
    }
}
