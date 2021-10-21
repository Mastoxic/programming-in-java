package agh.ii.prinjava.proj1.impl;

public interface MyQueue<E> {

    /**
     * this method adds the element given in parameter to the queue
     * @param x
     */
    void enqueue(E x);

    /**
     * this method removes and returns the first element added to the queue
     * (here, it removes the last element of the linked list MyQueue)
     * @return E
     */
    E dequeue();

    /**
     * this method returns true if the queue is empty, false otherwise
     * @return boolean
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * this method  returns the number of elements the queue has
     * @return int
     */
    int numOfElems();

    /**
     * this method returns the last element added to the queue (the first element of the linked list)
     * @return E
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
