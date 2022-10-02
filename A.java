//https://www.youtube.com/watch?v=a_LBuCx1KTE&ab_channel=BroCode

import java.util.concurrent.atomic.AtomicInteger;

class A implements Runnable{
    static AtomicInteger currentlyRunningCounter = new AtomicInteger();
    
    public void run() {
        currentlyRunningCounter.incrementAndGet();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e1){}
        
        currentlyRunningCounter.incrementAndGet();

        System.out.println("finish");

    }

    public static void main(String[] argv) throws Exception {
 
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new A());



        System.out.println("1");
        System.out.println("t1 " + t1.isAlive());
        System.out.println("t2 " + t2.isAlive());
        System.out.println("main " + Thread.currentThread().isAlive() + "\n");
        
        t1.start(); 
        t2.start();

        System.out.println("2");
        System.out.println("t1 " + t1.isAlive());
        System.out.println("t2 " + t2.isAlive());
        System.out.println("main " + Thread.currentThread().isAlive() + "\n");

        System.out.println(currentlyRunningCounter);

        System.out.println("");
        System.out.println("3");
        System.out.println("t1 " + t1.isAlive());
        System.out.println("t2 " + t2.isAlive());
        System.out.println("main " + Thread.currentThread().isAlive() + "\n");


        t1.join(); 
        t2.join();

        System.out.println("4");
        System.out.println("t1 " + t1.isAlive());
        System.out.println("t2 " + t2.isAlive());
        System.out.println("main " + Thread.currentThread().isAlive() + "\n");


       
    }
}