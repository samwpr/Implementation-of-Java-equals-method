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
    }

    public static void main(String[] argv) throws Exception {
 
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new A());
        t1.start(); 
        System.out.println("t1 " + t1.isAlive());
        t2.start();
        System.out.println("t2 " + t2.isAlive());
        System.out.println(currentlyRunningCounter);
        t1.join(); 
        System.out.println("t1 " + t1.isAlive());
        t2.join();
        System.out.println("t2 " + t2.isAlive());
       
    }
}