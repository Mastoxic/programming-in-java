package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {

    @Override
    public int pop() {
        if (numOfElems != 0){
            int returned = array[0];
            int[] new_array = new int[numOfElems - 1];
            for (int i = 0 ; i < numOfElems - 1 ; i++){
                new_array[i] = array[i+1];
            }
            array = new_array;
            numOfElems--;
            return returned;
        }
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public void push(int x) {
        int[] new_array = new int[numOfElems + 1];
        new_array[0] = x;
        for (int i = 0 ; i < numOfElems ; i++){
            new_array[i+1] = array[i];
        }
        array = new_array;
        numOfElems++;
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems != 0){
            return array[0];
        }
        throw new IllegalStateException("To be implemented");
    }

    private int numOfElems = 0;
    private int[] array = new int[0];
}
