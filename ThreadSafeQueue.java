/*
2020 Question 3b
Write a thread-safe implementation of a Java function 
void enqueue(List<Object> list, Object element)
that adds the object element to the given list.  Specifically, it should be safe to use this function with the same list object in several threads at the same time.
*/

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeQueue {
    private final ReentrantLock lock = new ReentrantLock();

    public void enqueue(List<Object> list, Object element){
        lock.lock();
        try{
            list.add(element);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args){
        ThreadSafeQueue list1 = new ThreadSafeQueue();
        list1.enqueue(1);

    }
}



