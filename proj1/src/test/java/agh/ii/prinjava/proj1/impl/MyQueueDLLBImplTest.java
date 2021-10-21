package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * this method tests the enqueue() method
     */
    @Test
    void enqueue() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(6);
        queueOfInts.enqueue(7);
        queueOfInts.enqueue(8);
        assertEquals("DLinkList{ 8 7 6 5 }", queueOfInts.toString());
    }

    /**
     * this method tests the dequeue() method
     */
    @Test
    void dequeue(){
        enqueue();
        assertEquals("DLinkList{ 8 7 6 5 }", queueOfInts.toString());
        assertEquals(5,queueOfInts.dequeue());
        assertEquals("DLinkList{ 8 7 6 }", queueOfInts.toString());
        assertEquals(6,queueOfInts.dequeue());
        assertEquals(7,queueOfInts.dequeue());
        assertEquals(8,queueOfInts.dequeue());
        assertEquals("DLinkList{ }", queueOfInts.toString());
    }

    /**
     * this method tests the peek() method
     */
    @Test
    void peek(){
        enqueue(); //DLinkList{ 8 7 6 5 }
        assertEquals(5, queueOfInts.peek());
    }

    /**
     * this method tests the numOfElems() method
     */
    @Test
    void numOfElems(){
        assertEquals(0, queueOfInts.numOfElems());
        enqueue(); //DLinkList{ 8 7 6 5 }
        assertEquals(4, queueOfInts.numOfElems());
    }

    /**
     * this method tests the overridden toString() method
     */
    @Test
    void toStringTest(){
        assertEquals("DLinkList{ }", queueOfInts.toString());
        queueOfInts.enqueue(7);
        queueOfInts.enqueue(6);
        queueOfInts.enqueue(5);
        assertEquals("DLinkList{ 5 6 7 }", queueOfInts.toString());
    }
}