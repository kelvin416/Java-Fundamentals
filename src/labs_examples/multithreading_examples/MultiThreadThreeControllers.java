package labs_examples.multithreading_examples;

class MultiThreadThreeControllers {
    public static void main(String[] args) {
        System.out.println("*** Main Thread Starting ***");

        MySecondRunnable class1 = new MySecondRunnable("Class 1");
        MySecondRunnable class2 = new MySecondRunnable("Class 2");
        MySecondRunnable class3 = new MySecondRunnable("Class 3");

        System.out.println("*** Main Thread Ending ***");
    }
}

class MySecondRunnable implements Runnable{

    Thread thread;

    public MySecondRunnable(String name) {

        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(thread.getName() + " starting.");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(500);
                System.out.println("In" + thread.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc){
            System.out.println(thread.getName() + "Interrupted");
        }
        System.out.println(thread.getName() + " terminating..");
    }
}
