package labs_examples.multithreading_examples;

class DeadLockController {
    public static void main(String[] args) {
        Integer resourceA = 0;
        Integer resourceB = 1;

        System.out.println("You are about to experience a deadlock. To exit press 'ctrl+C'");

        //starting the threads
        new Thread(new A(resourceA, resourceB)).start();
        new Thread(new B(resourceA, resourceB)).start();
    }
}

class A implements Runnable{
    //Keeping the reference of resource
    private final Integer resourceA;
    private final Integer resourceB;

    public A(Integer resourceA, Integer resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        System.out.println("Instance of class A run()");
        System.out.println("Instance of class A synchronizing on resourceA");

        synchronized (resourceA){
            System.out.println("Instance of class A synchronized on resourceA");
            try {
                //Sleep symbolises some work that the thread should be doing
                System.out.println("Instance of class A doing some work.");
                Thread.sleep(1000);
            } catch (InterruptedException exc){
                exc.printStackTrace();
            }

            System.out.println("Instance of class A synchronizing on resourceB");

            synchronized (resourceB){
                //never happens
                System.out.println("Instance of class A synchronized on resourceA and resourceB");
            }
        }
    }
}

class B implements Runnable{
    private final Integer resourceA;
    private final Integer resourceB;

    public B(Integer resourceA, Integer resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        System.out.println("Instance of class B run()");
        System.out.println("Instance of class B synchronizing resourceB");

        synchronized (resourceB){
            System.out.println("Instance of class B synchronizing resourceB");
            try {
                System.out.println("Instance of class B synchronized on resourceB");
                Thread.sleep(1000);
            } catch (InterruptedException exc){
                exc.printStackTrace();
            }

            System.out.println("Instance of class B synchronizing on resourceA");
            synchronized (resourceA){
                //never happens
                System.out.println("Instance of class B synchronized on resourceB and resourceA");
            }
        }
    }
}
