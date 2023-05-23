package labs_examples.multithreading_examples;

class ExpandingThread {
    public static void main(String[] args) {
        System.out.println("*** Main Thread Start ***");

        MyExpandingThread option1 = new MyExpandingThread("Option1");
        MyExpandingThread option2 = new MyExpandingThread("Option2");
        MyExpandingThread option3 = new MyExpandingThread("Option3");

        System.out.println("*** Main Thread Stop ***");
    }
}

class MyExpandingThread extends Thread{

    public MyExpandingThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting...");
        try{
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("In " + getName() + ", count is " + i);
            }
        } catch (InterruptedException exc){
            System.out.println(getName() + " interrupted");
        }

        System.out.println(getName() + " terminating");
    }
}
