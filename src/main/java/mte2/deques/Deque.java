// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: Deque.java

package mte2.deques;

import java.util.Iterator; // needed to be imported so Iterator can be used

// public class Deque {
public interface Deque<E> extends Iterable<E> {
    
    public void enqueueFront(E element);
    public void enqueueBack(E element);
    public E dequeueFront();
    public E dequeueBack();
    public int size();    

    // need to add the iterator
    @Override
    default Iterator<E> iterator() {
        throw new UnsupportedOperationException("Unsupported Operation");
    }

}