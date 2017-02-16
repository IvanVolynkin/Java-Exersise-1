package ru.learning.exersise;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Class for exercise MyArray.
 */
public class MyArray {

    /**
     *
     */
    private int cursor;

    /**
     *
     */
    private int[] myArray;

    /**
     *
     */
    private final static double increaseIndex = 1.5;

    /**
     *
     */
    public MyArray() {
        myArray = new int[10];
        this.cursor = 0;
    }

    /**
     *
     * @param arraySize
     */
    public MyArray (int arraySize) {
        myArray = new int[arraySize];
        this.cursor = 0;
    }

    /**
     *
     * @param elem
     * @return
     */
    public int add(int elem) {
        if(myArray.length > cursor) {
            myArray[cursor] = elem;
        } else {
            myArray = Arrays.copyOf(myArray, (int) (myArray.length * increaseIndex));
            myArray[cursor] = elem;
        }
        cursor++;
        return cursor - 1;
    }

    /**
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index >= myArray.length)
            throw new NoSuchElementException();
        return myArray[index];
    }

    /**
     * This is a test method to show values of array.
     */
    public void showArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
