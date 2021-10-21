package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * this method tests the push() method
     */
    @Test
    void push() {
        stackOfInts.push(5);
        stackOfInts.push(6);
        stackOfInts.push(7);
        stackOfInts.push(8);
        assertEquals("DLinkList{ 8 7 6 5 }", stackOfInts.toString());
    }

    /**
     * this method tests the pop() method
     */
    @Test
    void pop(){
        push();
        assertEquals("DLinkList{ 8 7 6 5 }", stackOfInts.toString());
        assertEquals(8,stackOfInts.pop());
        assertEquals("DLinkList{ 7 6 5 }", stackOfInts.toString());
        assertEquals(7,stackOfInts.pop());
        assertEquals(6,stackOfInts.pop());
        assertEquals(5,stackOfInts.pop());
        assertEquals("DLinkList{ }", stackOfInts.toString());
    }

    /**
     * this method tests the peek() method
     */
    @Test
    void peek(){
        push(); //DLinkList{ 8 7 6 5 }
        assertEquals(8, stackOfInts.peek());
    }

    /**
     * this method tests the numOfElems() method
     */
    @Test
    void numOfElems(){
        assertEquals(0, stackOfInts.numOfElems());
        push(); //DLinkList{ 8 7 6 5 }
        assertEquals(4, stackOfInts.numOfElems());
    }

    /**
     * this method tests the toStringTest() method
     */
    @Test
    void toStringTest(){
        assertEquals("DLinkList{ }", stackOfInts.toString());
        stackOfInts.push(7);
        stackOfInts.push(6);
        stackOfInts.push(5);
        assertEquals("DLinkList{ 5 6 7 }", stackOfInts.toString());
    }
}