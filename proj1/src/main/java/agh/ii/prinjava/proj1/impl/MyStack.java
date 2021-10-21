package agh.ii.prinjava.proj1.impl;

public interface MyStack<E> {

    /**
     * this method removes and returns the last element added to the stack
     * (here, it removes the first element of the linked list MyStack)
     * @return E
     */
    E pop();

    /**
     * this method adds the element given in parameter to the stack
     * @param x
     */
    void push(E x);

    /**
     * this method returns true if the stack is empty, false otherwise
     * @return boolean
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * this method  returns the number of elements the stack has
     * @return int
     */
    int numOfElems();

    /**
     * this method returns the last element added to the stack (the first element of the linked list)
     * @return E
     */
    E peek();

    /**Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
